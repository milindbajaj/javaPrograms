import java.sql.*;
class Sdelete
{
     public static final String DBURL = "jdbc:mysql://localhost:3306/firstdb";
     public static final String DBUSER = "milind";
     public static final String DBPASS = "vasu19@@";
     public static void main(String args[])
     {
          try
          {
               
               Class.forName("com.mysql.jdbc.Driver");
               
               Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
               
               String sql3 = "DELETE FROM Student WHERE sName=?";
               PreparedStatement statement1 = con.prepareStatement(sql3);
               statement1.setString(1, "Suresh");

               int rowsDeleted = statement1.executeUpdate();
               if (rowsDeleted > 0)
               {
                    System.out.println("A Employee was deleted successfully!\n");
               }
          }
catch(Exception e)
            {
            System.out.println(e);
            }
}
}