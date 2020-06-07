import java.sql.*;
class JoinExample
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
               
               String sql = "select rollno,id from emp inner join users ON users.name = emp.name";
               Statement stmt = con.createStatement();
               ResultSet result = stmt.executeQuery(sql);
               System.out.println("Two table join successfully");
               System.out.println("Id      Rollno  ");
               System.out.println("**===========**==========**");
               while (result.next())
               {
                    System.out.println (
                         result.getInt(1)+"     "+
                         result.getInt(2));
               }
               System.out.println("**===========**==========**\n");
          }
          catch(Exception ex)
          {
               ex.printStackTrace();
          }
     }
}