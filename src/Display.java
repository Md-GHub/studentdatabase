import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Display {
    public static void displayAll(){
        try{
            Connection con=Connect.dataBaseConnection();
            String query="SELECT * FROM EEE;";
            Statement st=con.createStatement();
            ResultSet result=st.executeQuery(query);
            while(result.next()){
                System.out.println(result.getString(1)+"     "+result.getString(2)+" ("+result.getFloat(3)+")");
            }
        }catch (SQLException e){}
    }
}
