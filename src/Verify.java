import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Verify {
    public static boolean verify(Connection connect,String un, String pass){
        String query="SELECT * FROM AUTHENTICATION WHERE USERNAME=? AND PASSWORD=?;";
        try{
            Connection con=connect;
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,un);
            pst.setString(2,pass);
            ResultSet result =pst.executeQuery();
            return result.next();
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
