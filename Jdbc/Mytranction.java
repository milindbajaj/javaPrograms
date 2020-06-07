import java.sql.*;  
class Mytranction{  
public static void main(String args[])throws Exception{  

Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb","milind","vasu19@@");  
con.setAutoCommit(false);  
  
Statement stmt=con.createStatement();  
stmt.executeUpdate("insert into users values('hari',16)");  
stmt.executeUpdate("insert into users values('irish',17)");

con.commit();
System.out.print("record sucessfully inserted");  
con.close();  
}}