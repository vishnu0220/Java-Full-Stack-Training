import java.sql.*;

public class JdbcUtil {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver registered");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static Connection getDBConnection() throws SQLException {
		String URL = "jdbc:mysql://localhost:3306/telusko";
		String USERNAME = "root";
		String PASSWORD = "rps@123";
		
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
	
	public static void closeResource(Connection connect, Statement stmt) throws SQLException {
		if(connect != null)
			connect.close();
		if(stmt != null)
			stmt.close();
	}
}
