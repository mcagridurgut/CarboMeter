package database;

import database.DatabaseConnection;
import mail.*;
import others.Report;
import user.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //DatabaseConnection.createNewUser("ucuncu", "ucuncu@gmail.com", "ucuncu", 0,0,0,0,0,1,"","","superUser1",0);
        //DatabaseConnection.changePassword("newbie","newChallenger","challenger123");
        //DatabaseConnection.completeChallenge("superUser1",12);
        //DatabaseConnection.updateData("newbie", 56,74,421, 142);
        //DatabaseConnection.changeEmail("newbie", "newChallenger","newChallenger@gmail.com");
//        if( DatabaseConnection.login( "newbie", "newChallenger" ) )
//           System.out.println("succesfly logged in");
        //DatabaseConnection.forgotPassword("newbie");
        try{
            NormalUser user = Login.NormalLogin("newCagri", "sadasa");
            user.addFriend("ucuncu");
            for( Report r: user.getFriends() ){
                System.out.println(r.getUser());
                System.out.println(r.getScore());
            }
            //user.createReport(143, 113, 313, 233);
        }catch (Exception e){
            e.printStackTrace();
        }

        //Login.forgotMyPassword("newbie");
        ArrayList<Object[]> arrayList = DatabaseConnection.selectAll();
        for(int j = 0; j<arrayList.size();j++ ) {
            Object[] arr = arrayList.get(j);
            for (int i = 0; i < DatabaseConnection.ROWSIZE; i++) {
                System.out.print(arr[i] + "\t");
            }System.out.println("");
        }
    }
}
