import java.sql.*;
class Sinsert
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
               
               String sql = "INSERT INTO Student(sId,sName) VALUES (?, ?)";
               PreparedStatement statement = con.prepareStatement(sql);
               statement.setInt(1, 3);
               statement.setString(2, "mahesh");
               

               int rowsInserted = statement.executeUpdate();
               if (rowsInserted > 0)
               {
                    System.out.println("A new employee was inserted successfully!\n");
               }
            }
            catch(Exception e)
            {
            System.out.println(e);
            }
}
}