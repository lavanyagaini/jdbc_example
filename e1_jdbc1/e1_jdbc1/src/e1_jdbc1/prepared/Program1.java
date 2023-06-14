package e1_jdbc1.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		///taking values from users 
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the id");
		int id=scanner.nextInt();
		System.out.println("enter the name");
		String name=scanner.next();
		System.out.println("enter the email");
		String email=scanner.next();

		//1.Load or register
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2.establish the connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentjdbcdb", "root", "Lavanya@01");
		
		//3.creation of statement
		String query="insert into student1 values(?,?,?)";
		
		PreparedStatement statement=connection.prepareStatement(query);
		
		statement.setInt(1, id);
		statement.setString(2, name);
		statement.setString(3, email);
		//4.execute the staement
		statement.execute();
		//5.close
		connection.close();
		
		System.out.println("inserted "+name +" data");
		
		
	}

}
