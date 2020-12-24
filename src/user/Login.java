package user;

import database.DatabaseConnection;
import others.Report;

import javax.management.InstanceAlreadyExistsException;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Login {
    public static NormalUser NormalLogin ( String emailOrUserName, String password ) throws NoSuchElementException{
        NormalUser user = null;
        if ( DatabaseConnection.login( emailOrUserName, password ) ){
            user = new NormalUser( "", "" ,"","");
            Object[] usr = DatabaseConnection.selectWithEmailOrUsername( emailOrUserName );
            user.setUsername( (String) usr[1] );
            user.setEmail( (String) usr[2] );
            user.setPassword( (String) usr[3] );
            user.setReferenceCode( (String) usr[12]);
            user.setFriends( setReports( DatabaseConnection.getFriends(user.getUsername()) ));
            user.setReports( setReports(DatabaseConnection.selectWithEmail( (String) usr[2] ) ) );
            return user;
        }
        throw new NoSuchElementException();
    }

    public static SuperUser SuperLogin ( String emailOrUserName, String password ) throws NoSuchElementException{
        SuperUser user = null;
        if ( DatabaseConnection.login( emailOrUserName, password ) ){
            user = new SuperUser( "", "" ,"","");
            Object[] usr = DatabaseConnection.selectWithEmailOrUsername( emailOrUserName );
            user.setUsername( (String) usr[1] );
            user.setEmail( (String) usr[2] );
            user.setPassword( (String) usr[3] );
            return user;
        }
        throw new NoSuchElementException();
    }

    public static NormalUser register ( String username, String email, String password, String refCode) throws Exception{
        NormalUser user = new NormalUser(username,email,password,refCode);
        if( user.getUsername().equals(""))
            throw new InstanceAlreadyExistsException("User already exists");
        return user;
    }

    public static void forgotMyPassword( String emailOrUsername ){
        DatabaseConnection.forgotPassword( emailOrUsername );
    }
    private static ArrayList<Report> setReports ( ArrayList<Object[]> reports){
        ArrayList<Report> reports1 = new ArrayList<Report>();
        for( Object[] obje : reports){
            Report oldReport = new Report( (String) obje[1], true, true, true,true);
            oldReport.setTransportationScore( (double)obje[5] );
            oldReport.setHomeScore( (double)obje[6] );
            oldReport.setFoodScore( (double)obje[7] );
            oldReport.setOthersScore( (double)obje[8] );
            oldReport.updateScore();
            reports1.add(oldReport);
        }
        return reports1;
    }
}
