package user;

import database.DatabaseConnection;
import Model.Report;

import javax.management.InstanceAlreadyExistsException;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Login class
 * @author Mustafa Çağrı Durgut
 * @version 27.12.2020
 */
public class Login {
    /**
     * Login for normal users
     * @param emailOrUserName --> email or username of the user
     * @param password --> password of the user
     * @return the user
     */
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

    /**
     * Login for super users
     * @param emailOrUserName --> email or username of the super user
     * @param password --> password of the super user
     * @return the super user
     */
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

    /**
     * Register for normal users
     * @param username --> username of the normal user
     * @param email --> email of the normal user
     * @param password --> password of the normal user
     * @param refCode --> referral code of the super user
     * @return the normal user
     */
    public static NormalUser register ( String username, String email, String password, String refCode) throws Exception{
        NormalUser user = new NormalUser(username,email,password,refCode);
        if( user.getUsername().equals(""))
            throw new InstanceAlreadyExistsException("User already exists");
        return user;
    }

    /**
     * Helps the user if they forgot their password
     * @param emailOrUsername --> email or username of the user
     */
    public static void forgotMyPassword( String emailOrUsername ){
        DatabaseConnection.forgotPassword( emailOrUsername );
    }

    /**
     * Sets the Reports
     * @param reports --> ArrayList of the reports
     * @return the reports
     */
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
