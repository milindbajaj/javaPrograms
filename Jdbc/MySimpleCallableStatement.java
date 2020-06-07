import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class MySimpleCallableStatement {
     
    public static void main(String a[]){
         
        Connection con = null;
        CallableStatement callSt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.
                getConnection("jdbc:mysql://localhost:3306/firstdb","milind","vasu19@@");
                    
            callSt = con.prepareCall("{call hello(?,?)}");
            callSt.setString(1,"drak");
            callSt.setInt(2,10);
            callSt.execute();
            System.out.println("Executed stored procedure!!!");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try{
                if(callSt != null) callSt.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }
    }
}