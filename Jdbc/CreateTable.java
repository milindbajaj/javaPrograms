import java.sql.*;
public class CreateTable
{
     Connection con;
     CreateTable()
     {
          try
          {
               Class.forName("com.mysql.jdbc.Driver");
               
               con=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb","milind","vasu19@@");
               
               PreparedStatement ps=con.prepareStatement("create table Student(sId int primary key,sName VARCHAR(30) not null )");
               
               int count=ps.executeUpdate();
               System.out.println(count);
               System.out.println("Table created successfully!!");
          }
          catch (Exception e)
          {
               e.printStackTrace();
          }
     }
     public static void main(String s[])
     {
          new CreateTable();
     }
}