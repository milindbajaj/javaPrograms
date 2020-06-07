import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class OutCallable{
 
	public static String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
	public static String CONNECTION_URL = "jdbc:mysql://localhost:3306/firstdb";
	public static String CONNECTION_USER = "milind";
	public static String CONNECTION_PASSWORD = "vasu19@@";
 
	public static void main(String[] args) {
 
		String callStoreProc = "{call hello(?,?)}";
 
		try (Connection connection = getConnection();
				CallableStatement callableStatement = connection
						.prepareCall(callStoreProc)) {
 
			callableStatement.setInt(1,10);
			callableStatement.registerOutParameter(2, java.sql.Types.VARCHAR);
 
			callableStatement.executeUpdate();
 
			String fullName = callableStatement.getString(2);
 
			System.out.println("Full name after executing Stored Procedure is ::"
							+ fullName);
 
		} catch (SQLException e) {
			System.out.println("An exception occured while updating data in database. Exception is :: "
							+ e);
		}
 
	}
 
	public static Connection getConnection() {
 
		try {
			Class.forName(DRIVER_CLASS_NAME);
		} catch (ClassNotFoundException e) {
			System.out.println("Error while registering JDBC driver");
			return null;
		}
 
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(CONNECTION_URL,
					CONNECTION_USER, CONNECTION_PASSWORD);
 
		} catch (SQLException e) {
			System.out.println("Failed to create Connection");
			return null;
		}
		System.out.println("Connection created Successfully.");
 
		return connection;
	}
 
}