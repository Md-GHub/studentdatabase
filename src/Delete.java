import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {

    public static void deleteid(){
        String query="DELETE FROM EEE WHERE ROLLNO=?;";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your Rollno To delete data: ");
        String rno=in.next();
        try{
            Connection con=Connect.dataBaseConnection();
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,rno);
            int row=pst.executeUpdate();
            if(row>0)
                System.out.println("Data Deleted");
            else
                System.out.println("Error in the operation");
            con.close();
        }catch(SQLException e){e.printStackTrace();}
    }
}
