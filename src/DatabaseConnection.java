import java.sql.*;
import java.util.ArrayList;

public class DatabaseConnection {
    static int ROWSIZE = 10;
    public static void createNewTableIfNotExists() {
        // SQLite connection string
        String wd = System.getProperty("user.dir").replace('\\','/');
        String url = "jdbc:sqlite:"+ wd +"/carbopoints.db";

        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS users (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	name text NOT NULL,\n"
                + "	password text NOT NULL,\n"
                + "	carbopoint real,\n"
                + "	transport real,\n"
                + "	housing real,\n"
                + "	electronics real,\n"
                + "	other real,\n"
                + "	userType integer,\n"
                + "	familyNumber integer\n"
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
        String wd = System.getProperty("user.dir").replace('\\','/');
        String url = "jdbc:sqlite:"+ wd +"/carbopoints.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public static void updateUser(String name, double carbopoint, double transport,double housing,double electronic,double other ){
       Object[] user =  select(name);
       createNewUser((String)user[1]+"-old-",(String)user[2],(double)user[3],(double)user[4],(double)user[5],(double)user[6],(double)user[7],(Integer)user[8],(Integer)user[9]);
       createNewUser((String)user[1],(String) user[2], carbopoint,transport,housing,electronic,other,(Integer)user[8],(Integer)user[9]);
    }
    public static void createNewUser(String name, String password, double carbopoint, double transport,double housing,double electronic,double other, int userType, int familyNumber ) {
        createNewTableIfNotExists();
        Object[] array = new Object[ROWSIZE];

            String sql = "INSERT INTO users(name, password, carbopoint,transport,housing,electronics,other,userType,familyNumber ) VALUES(?,?,?,?,?,?,?,?,?)";
            try (Connection conn = connect();
                 PreparedStatement pstmt  = conn.prepareStatement(sql)) {
                pstmt.setString(1, name);
                pstmt.setString(2, password);
                pstmt.setDouble(3, carbopoint);
                pstmt.setDouble(4, transport);
                pstmt.setDouble(5, housing);
                pstmt.setDouble(6, electronic);
                pstmt.setDouble(7, other);
                pstmt.setInt(8, userType);
                pstmt.setInt(9, familyNumber);
                pstmt.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
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
                array[2]= rs.getString("password");
                array[3]= rs.getDouble("carbopoint");
                array[4]= rs.getDouble("transport");
                array[5]= rs.getDouble("housing");
                array[6]= rs.getDouble("electronics");
                array[7]= rs.getDouble("other");
                array[8]= rs.getInt("userType");
                array[9]= rs.getInt("familyNumber");
                arrayList.add(array);
            }
        } catch (SQLException e) {
            return null;
        }
        return arrayList;
    }
    public static Object[] select(String name){
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
                array[2]= rs.getString("password");
                array[3]= rs.getDouble("carbopoint");
                array[4]= rs.getDouble("transport");
                array[5]= rs.getDouble("housing");
                array[6]= rs.getDouble("electronics");
                array[7]= rs.getDouble("other");
                array[8]= rs.getInt("userType");
                array[9]= rs.getInt("familyNumber");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return array;
    }

}
