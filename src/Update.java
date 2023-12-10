import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {
    public static void updateByRollno() throws SQLException {
        String query1="UPDATE EEE SET NAME=? WHERE ROLLNO=?;";
        String query2="UPDATE EEE SET NAME=? WHERE ROLLNO=?;";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your Rollno: ");
        String rno=in.next();
        System.out.println("Do you want to edit your name? (Y/N) ");
        String s1=in.next();
        System.out.println("Do you want to edit your name? (Y/N) ");
        String s2=in.next();
        Connection con=Connect.dataBaseConnection();
        if(s1.equals("Y") || s1.equals("y")){
            System.out.println("Edit Your Name: ");
            String s=in.next();
            PreparedStatement pst=con.prepareStatement(query1);
            pst.setString(1,s);
            pst.setString(2,rno);
            int row=pst.executeUpdate();
            if(row>0)
                System.out.println("Changes made");
            else {
                System.out.println("Not Changed");
            }
        }
        if(s2.equals("Y") || s2.equals("y")){
            System.out.println("Edit Your GPA: ");
            float s=in.nextFloat();
            PreparedStatement pst=con.prepareStatement(query2);
            pst.setFloat(1,s);
            pst.setString(2,rno);
            int row=pst.executeUpdate();
            if(row>0)
                System.out.println("Changes made");
            else {
                System.out.println("Not Changed");
            }
        }
        con.close();
    }
}
