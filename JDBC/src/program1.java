


// 1. Write a program to insert a row into employee table.
// 2. Write a program to update the salary of the employee by 5000 who
//    belongs to finance department.
// 3. Write a program to delete a row of the employee who belongs to sales department.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class program1 {

	static String url = "jdbc:mysql://localhost:3306/jdbc";
	static String username = "root";
	static String password = "root";
	private static Connection connection;
	private static Statement statement;

	public static void main(String[] args) {
		
		/**
		 * insert query
		 * update query
		 */
		
		String insert_Query = "insert into employee(id,name,email,salary) values (8,'Kavya','kavya@gmail.com',50000);";
		String update_Query = "update employee set `salary`=`salary`- 5000 where dept = 'it';";
		String delete_Query = "delete from employee where dept='sales';";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		connection = DriverManager.getConnection(url, username, password);
		 
		statement = connection.createStatement();
		
		//Query has to be changed here.
//		int i = statement.executeUpdate(insert_Query);	//	Query to insert data.
//		int i = statement.executeUpdate(update_Query); // Query to update data.
		int i = statement.executeUpdate(delete_Query); // Query to delete data.
		
		System.out.println(i);
		
		statement.close();
		connection.close();		
		
		
		 
		 

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
