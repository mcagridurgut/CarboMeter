import java.sql.*;
public class DatabaseConnection {
    public static void createNewTableIfNotExists() {
        // SQLite connection string
        String wd = System.getProperty("user.dir").replace('\\','/');
        String url = "jdbc:sqlite:"+ wd +"/carbopoints.db";

        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS users (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	name text NOT NULL,\n"
                + "	carbopoint real,\n"
                + "	transport real,\n"
                + "	housing real,\n"
                + "	electronics real,\n"
                + "	other real\n"
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
    public static void insert(String name, double carbopoint, double transport,double housing,double electronic,double other) {
        createNewTableIfNotExists();
        String sql = "INSERT INTO users(name,carbopoint,transport,housing,electronics,other) VALUES(?,?,?,?,?,?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setDouble(2, carbopoint);
            pstmt.setDouble(3, transport);
            pstmt.setDouble(4, housing);
            pstmt.setDouble(5, electronic);
            pstmt.setDouble(6, other);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void selectAll(){
        createNewTableIfNotExists();
        String sql = "SELECT * FROM users";

        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") +  "\t" +
                        rs.getString("name") + "\t" +
                        rs.getDouble("carbopoint") + "\t" +
                        rs.getDouble("transport") + "\t" +
                        rs.getDouble("housing") + "\t" +
                        rs.getDouble("electronics") + "\t" +
                        rs.getDouble("other"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void select(String name){
        createNewTableIfNotExists();
        String sql = "SELECT * FROM users ORDER BY carbopoint DESC";

        try (Connection conn = connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") +  "\t" +
                        rs.getString("name") + "\t" +
                        rs.getDouble("carbopoint") + "\t" +
                        rs.getDouble("transport") + "\t" +
                        rs.getDouble("housing") + "\t" +
                        rs.getDouble("electronics") + "\t" +
                        rs.getDouble("other"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
