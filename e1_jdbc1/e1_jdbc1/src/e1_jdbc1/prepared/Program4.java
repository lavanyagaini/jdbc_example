package e1_jdbc1.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Program4 {

	//retrieve the data 
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("to get your data pls provide your id");
		int id=sc.nextInt();
		//load or register
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2.establish the connection
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentjdbcdb", "root", "root");
		
		//3.create the statement
		PreparedStatement statement=c.prepareStatement("select * from student1  where id =?");
		statement.setInt(1, id);		
		//4.execute the statement
		
		ResultSet result = statement.executeQuery();
		
		while(result.next()) {
			System.out.println(result.getInt(1)+" ====="+result.getString(2)+"===="+result.getString(3));
		}
		//5.close
	   c.close();
		

		
		
		
	}

}
