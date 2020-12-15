import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //DatabaseConnection.createNewUser("second", "hello",1,2,3,4,5,6,7);
//        ArrayList<Object[]> arrayList = DatabaseConnection.selectAll();
//        for(int j = 0; j<arrayList.size();j++ ) {
//            Object[] arr = arrayList.get(j);
//            for (int i = 0; i < DatabaseConnection.ROWSIZE; i++) {
//                System.out.print(arr[i] + "\t");
//            }System.out.println("");
//        }
            Object[] arr = DatabaseConnection.select("third");
            if(arr == null)
                System.out.println("it is null");
            else {
                for (int i = 0; i < DatabaseConnection.ROWSIZE; i++) {
                    System.out.print(arr[i] + "\t");
                }
            }
    }
}
