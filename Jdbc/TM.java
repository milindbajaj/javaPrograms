import java.sql.*;  
import java.io.*;  
class TM{  
public static void main(String args[]){  
try{  
  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb","milind","vasu19@@");  
con.setAutoCommit(false);  
  
PreparedStatement ps=con.prepareStatement("insert into users values(?,?)");  
  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
while(true){  
  
System.out.println("enter name");  
String name=br.readLine();  
 
  
System.out.println("enter rollno");  
String s1=br.readLine();  
int rollno=Integer.parseInt(s1);   
   
ps.setString(1,name);  
ps.setInt(2,rollno);  
ps.executeUpdate();  
  
System.out.println("commit/rollback");  
String answer=br.readLine();  
if(answer.equals("commit")){  
con.commit();  
}  
if(answer.equals("rollback")){  
con.rollback();  
}  
  
  
System.out.println("Want to add more records y/n");  
String ans=br.readLine();  
if(ans.equals("n")){  
break;  
}  
  
}  
con.commit();  
System.out.println("record successfully saved");  
  
con.close();//before closing connection commit() is called  
}catch(Exception e){System.out.println(e);}  
  
}} 