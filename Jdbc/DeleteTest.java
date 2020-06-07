import java.sql.*;
import java.util.Scanner;
class DeleteTest
{
     public static final String DBURL = "jdbc:mysql://localhost:3306/firstdb";
     public static final String DBUSER = "milind";
     public static final String DBPASS = "vasu19@@";
     public static void main(String[] args) throws Exception
     {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter record number which you want to delete: ");
          int stno = sc.nextInt();
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
          String qry = "delete  from Student where sId=(select max(sId) from Student where sName<=?)
          
          PreparedStatement pst=con.prepareStatement(qry);
          pst.setInt(1,stno);
          
          int count = pst.executeUpdate();

          if(count != 0)
               System.out.println(count+" Record deleted successfully\n");
          else            
               System.out.println("Record deletion failed\n");

          pst.close();
          con.close();
     }
}