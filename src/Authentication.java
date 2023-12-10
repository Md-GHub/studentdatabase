import java.sql.*;
import java.util.*;
public class Authentication {
    private static String url = "jdbc:mysql://localhost:3306/sdb";
    private static String username = "root";
    private static String passcode = "0807";
    public static Connection auth() throws SQLException{
        Connection con=DriverManager.getConnection(url,username,passcode);
        return con;
    }
}
