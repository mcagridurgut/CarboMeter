package database;

import database.DatabaseConnection;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //DatabaseConnection.createNewUser("newbie", "newbie@gmail.com", "newChallenger", 0,0,0,0,0,2,"","","superUser1",0);
        //DatabaseConnection.changePassword("newbie","newChallenger","challenger123");
        //DatabaseConnection.completeChallenge("superUser1",12);
        //DatabaseConnection.updateData("newbie", 56,74,421, 142);
        //DatabaseConnection.changeEmail("newbie", "newChallenger","newChallenger@gmail.com");
        if( DatabaseConnection.login( "newbie", "newChallenger" ) )
           System.out.println("succesfly logged in");
        ArrayList<Object[]> arrayList = DatabaseConnection.selectAll();
        for(int j = 0; j<arrayList.size();j++ ) {
            Object[] arr = arrayList.get(j);
            for (int i = 0; i < DatabaseConnection.ROWSIZE; i++) {
                System.out.print(arr[i] + "\t");
            }System.out.println("");
        }

    }
}
