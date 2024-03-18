import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

class tableData {
	

	static String url = "jdbc:mysql://localhost:3306/jdbc";
	static String username = "root";
	static String password = "root";

	public static void main(String[] args) {
		
		
		try {
			Connection connection = DriverManager.getConnection(url,username,password);
			
//			DatabaseMetaData metaData = connection.getMetaData();			
//			
//			System.out.println(metaData.getDatabaseProductName());
//			
//		    System.out.println(	metaData.getDatabaseProductVersion());
			
			
			Statement statement = connection.createStatement();
			
			String query = "select * from employee;";
			
			ResultSet res = statement.executeQuery(query);
			
			ResultSetMetaData data = res.getMetaData();
			
			System.out.println(data.getColumnCount());
			
			String columnName = data.getColumnName(3);
			
			System.out.println(columnName);
			
			
			
			
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
