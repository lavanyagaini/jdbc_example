package e1_jdbc1.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int id = sc.nextInt();
		System.out.println("=========for update pls provide the data below==================");

		System.out.println("enter name");
		String name = sc.next();

		System.out.println("enter email");
		String email = sc.next();

		// 1.load or register
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2.estabish the connection

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentjdbcdb", "root","Lavanya@01");

		// creation of statement

		PreparedStatement preparedStatement = connection.prepareStatement("update student1 set name=? ,email=? where id=?");

		preparedStatement.setInt(3, id);
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, email);

		// execute the statement

		preparedStatement.execute();

		// close the connection
		connection.close();

		System.out.println(id + "your data where updated");

	}

}
