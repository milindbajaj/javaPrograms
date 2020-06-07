import java.sql.*;
class Sselect
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

               
               String sql1 = "SELECT * FROM Student";
               Statement stmt = con.createStatement();
               ResultSet result = stmt.executeQuery(sql1);

               while (result.next())
               {
                    System.out.println (result.getInt(1)+" "+
                    result.getString(2));
                   ;
               }
            }
catch(Exception e)
            {
            System.out.println(e);
            }
}
}
