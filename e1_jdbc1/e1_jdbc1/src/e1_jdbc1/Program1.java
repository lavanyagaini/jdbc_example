package e1_jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program1 {

	//inserting the data
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1.load or register
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 2.establish the connection

		String url = "jdbc:mysql://localhost:3306/Student1";
		String user = "root";
		String pwd = "Lavanya@01";

		Connection connection = DriverManager.getConnection(url, user, pwd);

		// 3.creation the statement
		Statement statement = connection.createStatement();

		// 4.execute the statement
		String query = "insert into student1 values(1,'radha','radha@gmail.com')";
		statement.execute(query);

		// close
		connection.close();

		System.out.println("inserted");

	}

}
