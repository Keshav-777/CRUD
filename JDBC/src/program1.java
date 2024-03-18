import java.sql.Connection;
import java.sql.DriverManager;

class program1 {

	static String url = "jdbc:mysql://localhost:3306/jdbc";
	static String username = "root";
	static String password = "root";
	private static Connection connection;

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		 connection = DriverManager.getConnection(url, username, password);
		 
		 connection.
		 
		 

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
