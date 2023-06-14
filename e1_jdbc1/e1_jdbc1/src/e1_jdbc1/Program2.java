package e1_jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program2 {
	
	//update the attribute
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.load or register
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2.establish the connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentjdbcdb","root","Lavanya@01");
		//3.create a statement
		Statement statement=connection.createStatement();
		//4.execute the statement
	 statement.execute("update  student1 set name='rakesh' , email='rakesh@gmail.com'  where id=2");
		
		//5.close
		statement.close();
		connection.close();
		
		System.out.println("updated");
		
		
	}
	
               
	
	
}
