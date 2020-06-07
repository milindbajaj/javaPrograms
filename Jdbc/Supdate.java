import java.sql.*;
class Supdate
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

               
                String sql2 = "Update Student set sName = ? where sId = ?";
               PreparedStatement pstmt = con.prepareStatement(sql2);
               pstmt.setString(1, "Ramesh");
               pstmt.setInt(2,1);
               int rowUpdate = pstmt.executeUpdate();
               if (rowUpdate > 0)
               {
                    System.out.println("\nRecord updated successfully!!\n");
               }
             }
catch(Exception e)
            {
            System.out.println(e);
            }
}
}