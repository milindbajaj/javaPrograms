import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AutoGenKey {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/firstdb?useSSL=false";
        String user = "milind";
        String password = "vasu19@@";

        String sName = "lakhan";
        int rn=19;
        String sql = "INSERT INTO users(name,rollno) VALUES(?,?)";

        try (Connection con = DriverManager.getConnection(url, user, password); 
     PreparedStatement preparedStatement = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) 
{

            preparedStatement.setString(1, sName);
            preparedStatement.setInt(2,rn);
            preparedStatement.executeUpdate();

            try (ResultSet resultSet = preparedStatement.getGeneratedKeys()) {

                if (resultSet.first()) {

                    System.out.printf("The ID of new student : %d", resultSet.getLong(1));
                }
            }
            System.out.println("record inserted");
           System.out.println("The ID of new student:20");
        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(AutoGenKey.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
}