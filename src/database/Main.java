package database;

import database.DatabaseConnection;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //DatabaseConnection.createNewUser("RealsuperUser2", "superUser2@gmail.com", "superUser2", 0,0,0,0,0,2,"","","ucuncu111",0);
        //DatabaseConnection.updatePassword("besinci","girisgen123","girisgen123");
        DatabaseConnection.addChallenge("RealsuperUser2",11);
        ArrayList<Object[]> arrayList = DatabaseConnection.selectAll();
        for(int j = 0; j<arrayList.size();j++ ) {
            Object[] arr = arrayList.get(j);
            for (int i = 0; i < DatabaseConnection.ROWSIZE; i++) {
                System.out.print(arr[i] + "\t");
            }System.out.println("");
        }

    }
}
