import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        //STEP 1: ADD AUTHENTICATION :
        try {
            Connection con = Authentication.auth();
            Scanner in = new Scanner(System.in);
            System.out.println("USERNAME: ");
            String username=in.next();
            System.out.println("PASSWORD: ");
            String password=in.next();
            if(Verify.verify(con,username,password)){
                //STEP 2: DISPLAY OPTIONS :
                System.out.println("OPTIONS :");
                System.out.println("1.Display");
                System.out.println("2.Display By RollNo");
                System.out.println("3.Add Student Data");
                System.out.println("4.Update Details");
                System.out.println("5.Delete Data");
                System.out.println("Enter Your Option: ");
                int input=in.nextInt();
                switch (input){
                    case 1:
                        Display.displayAll();
                        break;
                    case 2:
                        DisplayById.Display();
                        break;
                    case 3:
                        Insert.insertStudent();
                        break;
                    case 4:
                        Update.updateByRollno();
                        break;
                    case 5:
                        Delete.deleteid();
                        break;
                }
            }else {
                System.out.println("Authentication Failed!");
            }
        }catch(SQLException e){}

    }
}