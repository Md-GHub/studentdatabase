import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class Insert {
    public static void insertStudent(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your Rollno: ");
        String rn=in.next();
        System.out.println("Enter your Name: ");
        String name=in.next();
        System.out.println("Enter Your GPA: ");
        float gpa= in.nextFloat();
        try{
            Connection con=Connect.dataBaseConnection();
            String query="INSERT INTO EEE VALUES(?,?,?);";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,rn);
            pst.setString(2,name);
            pst.setFloat(3,gpa);
            int rows=pst.executeUpdate();
            if(rows>0)
                System.out.println("Insert successfully!");
            else
                System.out.println("Insertion Unsuccessful!");
            con.close();
        }catch(SQLException e){}
    }
}
