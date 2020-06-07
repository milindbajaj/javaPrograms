import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
public class MyPreparedStatement {
 
    public static void main(String a[]){
         
        Connection con = null;
        PreparedStatement prSt = null;
        try {
             Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.
                getConnection("jdbc:mysql://localhost:3306/firstdb","milind","vasu19@@");
            String query = "insert into users(name,rollno) values(?,?)";
            prSt = con.prepareStatement(query);
            prSt.setString(1, "ebun");
            prSt.setInt(2, 13);
            //count will give you how many records got updated
            int count = prSt.executeUpdate();
            //Run the same query with different values
            prSt.setString(1, "fagun");
            prSt.setInt(2, 14);
            count = prSt.executeUpdate();
             System.out.println("records Successfully inserted");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try{
                if(prSt != null) prSt.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }
    }
}