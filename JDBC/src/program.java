import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class program {
	static String url = "jdbc:mysql://localhost:3306/jdbc";
	static String username = "root";
	static String password = "root";
	static Connection con = null;
	static Statement stm = null;
	static ResultSet result = null;

	public static void main(String[] args) {
		

		try {

			Class.forName("com.mysql.cj.jdbc.Driver"); // loading
			con = DriverManager.getConnection(url, username, password); // Connection
			stm = con.createStatement(); // SQL statement
			String query = "select * from employee;";
			result = stm.executeQuery(query); // execute SQL Query
			
			while(result.next()) {
				System.out.println(result.getInt(1)+" "+result.getString(2)+" "+
									result.getString(3)+" "+result.getInt(4));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {

			close(con,stm);

		}

	}

	public static void close(Connection con,Statement stm) {
		try {
			if (result != null)
				result.close();
		} catch (Exception e) {

			e.printStackTrace();
		}

		try {
			if (stm != null)
				stm.close();
		} catch (Exception e) {

			e.printStackTrace();
		}

		try {
			if (con != null)
				con.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	

}
