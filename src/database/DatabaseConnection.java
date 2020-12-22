package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class DatabaseConnection {
    public static int ROWSIZE = 14;

    static String wd = System.getProperty("user.dir").replace('\\','/');
    static String url = "jdbc:sqlite:"+ wd +"/carbopoints.db";
    public static void createNewTableIfNotExists() {

        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS users (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	name text NOT NULL,\n"
                + "	email text NOT NULL,\n"
                + "	password text NOT NULL,\n"
                + "	carbopoint real,\n"
                + "	transport real,\n"
                + "	housing real,\n"
                + "	electronics real,\n"
                + "	other real,\n"
                + "	userType integer,\n"
                + "	challenges text,\n"
                + "	friends text,\n"
                + "	refCode text,\n"
                + "	donate real\n"
                + ");";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Connection connect() {
        // SQLite connection string
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public static boolean isSuchUserExists(String name){
        Object[] arr  = select(name);
        return (arr != null && arr[0] != null);
    }
    public static void updateUser(String name, String email, String password, double carbopoint, double transport,double housing,double electronics,double other, int userType, String challenges, String friends,String refCode, double donate ) throws NoSuchElementException{
        if(isSuchUserExists(name)) {
            Object[] user = select(name);
            if (!isSuchUserExists((String) user[1] + "-old-"))
                createNewUser((String) user[1] + "-old-", (String) user[2], (String) user[3], (double) user[4], (double) user[5], (double) user[6], (double) user[7],  (double) user[8], (Integer) user[9], (String) user[10], (String) user[11],(String) user[12], (Double) user[13]);
            else
                update((String) user[1] + "-old-", (String) user[2], (String) user[3], (double) user[4], (double) user[5], (double) user[6], (double) user[7],  (double) user[8], (Integer) user[9], (String) user[10], (String) user[11],(String) user[12], (Double) user[13] );
            update(name,email, password, carbopoint, transport, housing, electronics, other, userType, challenges, friends,refCode,donate);
            return;
        }
        throw new NoSuchElementException("no such user");
    }

    public static Object[] getOldValues(String name){
        return select(name+"-old-");
    }

    private static void update(String name, String email, String password, double carbopoint, double transport, double housing, double electronics, double other, int userType, String challenges, String friends, String refCode, double donate) {
        Object[] array = new Object[ROWSIZE];
        String sql = "UPDATE users SET " +
                "email = '"+email+"'," +
                "password = '"+password+"'," +
                "carbopoint = '"+ carbopoint + "',"+
                "transport = '"+ transport + "',"+
                "housing = '"+ housing + "',"+
                "electronics = '"+ electronics + "',"+
                "other = '"+ other + "',"+
                "userType = '"+ userType + "',"+
                "challenges = '"+ challenges + "',"+
                "friends = '"+ friends + "',"+
                "refCode = '"+ refCode + "',"+
                "donate = '"+ donate + "'"+
                " WHERE name  = '" + name + "';";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createNewUser(String name, String email, String password, double carbopoint, double transport,double housing,double electronics,double other, int userType, String challenges, String friends,String refCode, double donate ){
        createNewTableIfNotExists();
        if(!isSuchUserExists(name)) {
            Object[] array = new Object[ROWSIZE];
            String sql = "INSERT INTO users(name, email, password, carbopoint,transport,housing,electronics,other,userType,challenges,friends,refCode,donate ) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            try (Connection conn = connect();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, name);
                pstmt.setString(2, email);
                pstmt.setString(3, password);
                pstmt.setDouble(4, carbopoint);
                pstmt.setDouble(5, transport);
                pstmt.setDouble(6, housing);
                pstmt.setDouble(7, electronics);
                pstmt.setDouble(8, other);
                pstmt.setInt(9, userType);
                pstmt.setString(10, challenges);
                pstmt.setString(11, friends);
                pstmt.setString(12, refCode);
                pstmt.setDouble(13, donate);
                pstmt.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static ArrayList<Object[]> selectAll(){
        createNewTableIfNotExists();
        ArrayList<Object[]> arrayList = new ArrayList<>();
        String sql = "SELECT * FROM users";

        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {
                Object[] array = new Object[ROWSIZE];
                array[0]= rs.getInt("id");
                array[1]= rs.getString("name");
                array[2]= rs.getString("email");
                array[3]= rs.getString("password");
                array[4]= rs.getDouble("carbopoint");
                array[5]= rs.getDouble("transport");
                array[6]= rs.getDouble("housing");
                array[7]= rs.getDouble("electronics");
                array[8]= rs.getDouble("other");
                array[9]= rs.getInt("userType");
                array[10]= rs.getString("challenges");
                array[11]= rs.getString("friends");
                array[12]= rs.getString("refCode");
                array[13]= rs.getDouble("donate");
                arrayList.add(array);
            }
        } catch (SQLException e) {
            return null;
        }
        return arrayList;
    }
    public static Object[] select(String name)  {
        createNewTableIfNotExists();
        Object[] array = new Object[ROWSIZE];
        String sql = "SELECT * FROM users WHERE name = '"+name+"'";

        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {
                array[0]= rs.getInt("id");
                array[1]= rs.getString("name");
                array[2]= rs.getString("email");
                array[3]= rs.getString("password");
                array[4]= rs.getDouble("carbopoint");
                array[5]= rs.getDouble("transport");
                array[6]= rs.getDouble("housing");
                array[7]= rs.getDouble("electronics");
                array[8]= rs.getDouble("other");
                array[9]= rs.getInt("userType");
                array[10]= rs.getString("challenges");
                array[11]= rs.getString("friends");
                array[12]= rs.getString("refCode");
                array[13]= rs.getDouble("donate");
            }
        } catch (SQLException e) {
            return null;
        }
        return array;
    }

    public static boolean updatePassword( String name, String oldPassword, String newPassword ){
        if(isSuchUserExists(name)) {
            Object[] user = select(name);
            if ( !user[3].equals(oldPassword) )
                return false;
            update((String) user[1], (String) user[2], newPassword, (double) user[4], (double) user[5], (double) user[6], (double) user[7], (double) user[8], (Integer) user[9], (String) user[10], (String) user[11],(String) user[12], (Double) user[13]);
            return true;
        }
        return false;
    }

    public static boolean addFriend (String name, String friend){
        if(isSuchUserExists(name)) {
            if ( !isSuchUserExists(friend) )
                return false;
            Object[] user = select(name);
            int friendNumber = (Integer) select(friend)[0];
            String friends = (String) user[11] +"-"+ friendNumber;
            update((String) user[1], (String) user[2], (String) user[3], (double) user[4], (double) user[5], (double) user[6], (double) user[7], (double) user[8], (Integer) user[9], (String) user[10], friends,(String) user[12], (Double) user[13]);
            return true;
        }
        return false;
    }
    public static ArrayList<Object[]> getSuperUsers(){
        ArrayList<Object[]> superUsers = new ArrayList<>();
        createNewTableIfNotExists();
        String sql = "SELECT * FROM users WHERE userType = '"+2+"'";

        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {
                Object[] array = new Object[ROWSIZE];
                array[0]= rs.getInt("id");
                array[1]= rs.getString("name");
                array[2]= rs.getString("email");
                array[3]= rs.getString("password");
                array[4]= rs.getDouble("carbopoint");
                array[5]= rs.getDouble("transport");
                array[6]= rs.getDouble("housing");
                array[7]= rs.getDouble("electronics");
                array[8]= rs.getDouble("other");
                array[9]= rs.getInt("userType");
                array[10]= rs.getString("challenges");
                array[11]= rs.getString("friends");
                array[12]= rs.getString("refCode");
                array[13]= rs.getDouble("donate");
                superUsers.add(array);
            }
        } catch (SQLException e) {
            return null;
        }
        return superUsers;
    }
}
