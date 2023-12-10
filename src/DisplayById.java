import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DisplayById {
    public static void Display(){
        String query="SELECT NAME,GPA FROM EEE WHERE ROLLNO=?;";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your Rollno to fetch the data:");
        String s=in.next();
        try{
            Connection con=Connect.dataBaseConnection();
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,s);
            ResultSet result =pst.executeQuery();
            while(result.next()){
                System.out.println(result.getString("NAME")+" "+result.getString("GPA"));
            }
            con.close();
        }catch (SQLException e){}
    }
}
