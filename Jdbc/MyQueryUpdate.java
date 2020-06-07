import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
 
public class MyQueryUpdate {
 
    public static void main(String[] args) {
         
        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/firstdb","milind","vasu19@@");
                       
            stmt = con.createStatement();
            //String query = "UPDATE table users SET name=name WHERE rollno=1";
            String query = "UPDATE users SET name=name WHERE rollno=1";
            //count will give you how many records got updated
            int count = stmt.executeUpdate(query);
            System.out.println("Updated queries: 1");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try{
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }
    }
}