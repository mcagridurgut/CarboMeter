import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection.createNewUser("second", "second",312,4.21,32,44,51,6,7);
        ArrayList<Object[]> arrayList = DatabaseConnection.selectAll();
        for(int j = 0; j<arrayList.size();j++ ) {
            Object[] arr = arrayList.get(j);
            for (int i = 0; i < DatabaseConnection.ROWSIZE; i++) {
                System.out.print(arr[i] + "\t");
            }System.out.println("");
        }

    }
}
