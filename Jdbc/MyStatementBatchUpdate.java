import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
 
public class MyStatementBatchUpdate {
 
    public static void main(String a[]){
         
        Connection con = null;
        Statement st = null;
        try {
             Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.
                getConnection("jdbc:mysql://localhost:3306/firstdb","milind","vasu19@@");
            con.setAutoCommit(false);
            st = con.createStatement();
            st.addBatch("update users set rollno=5 where name='kalu'");
            st.addBatch("insert into users values ('thor',12)");
            st.addBatch("update users set name='Ram' where rollno=5");
            int count[] = st.executeBatch();
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
                if(st != null) st.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }
    }
}