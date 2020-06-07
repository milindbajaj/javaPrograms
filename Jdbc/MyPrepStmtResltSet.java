import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
public class MyPrepStmtResltSet {
 
public static void main(String a[]){
         
        Connection con = null;
        PreparedStatement prSt = null;
        ResultSet rs = null;
        try {
             Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.
                getConnection("jdbc:mysql://localhost:3306/firstdb","milind","vasu19@@");
            String query = "select * from users where rollno=?";
            prSt = con.prepareStatement(query);
            prSt.setInt(1,69);
            rs = prSt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("name")+" -- "+rs.getInt("rollno"));
            }
            rs.close();
            prSt.setInt(1,5000);
            rs = prSt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("name")+" -- "+rs.getInt("rollno"));
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try{
                if(rs != null) rs.close();
                if(prSt != null) prSt.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }
    }
}