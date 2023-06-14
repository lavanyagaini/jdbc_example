package e1_jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program4 {
	
	
	//retriving the data

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//1.load /register
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2.establish the connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentjdbcdb", "root", "Lavanya@01");
		//3.create the statement
		Statement statement=connection.createStatement();
		//4execute the statement
		//boolean result1 = statement.execute("select * from student1");
		//System.out.println(result1);=====true (dql command)
		//statement.executeUpdate("select * from student1");======exception sql
		
		ResultSet result = statement.executeQuery("select * from student1");
		
		while(result.next()) {
			
			System.out.println(result.getInt(1));//===id
			System.out.println(result.getString(3));//=====email
			System.out.println(result.getString(2));//=====name
			System.out.println("============================");
			
			System.out.println(result.getInt("id")+" = "+result.getString("name"));
			
			
		}
		
		  
		//close 
		connection.close();
		
		
		
		
	
		
		
		
		

	}

}
