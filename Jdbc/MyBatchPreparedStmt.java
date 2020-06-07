import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
public class MyBatchPreparedStmt {
 
    public static void main(String a[]){
         
        Connection con = null;
        PreparedStatement pst = null;
        try {
             Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.
                getConnection("jdbc:mysql://localhost:3306/firstdb","milind","vasu19@@");
            con.setAutoCommit(false);
            pst = con.prepareStatement("update users set rollno=? where name=?");
            pst.setInt(1,68);
            pst.setString(2,"mohan");
            pst.addBatch();
            pst.setInt(1, 100);
            pst.setString(2,"police");
            pst.addBatch();
            int count[] = pst.executeBatch();
            for(int i=1;i<=count.length;i++){
                System.out.println("Query "+i+" has effected "+count[i]+" times");
            }
            con.commit();
        } catch (ClassNotFoundException e) {
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally{
            try{
                if(pst != null) pst.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }
    }
}