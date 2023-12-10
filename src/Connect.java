import java.sql.*;

public class Connect {
    public static Connection dataBaseConnection() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/sdb";
        String username = "root";
        String passcode = "0807";
        try {
            return DriverManager.getConnection(url, username, passcode);
        } catch (SQLException e) {
            // Handle the exception (log, print, or rethrow)
            e.printStackTrace();
            throw e;
        }
    }
}
