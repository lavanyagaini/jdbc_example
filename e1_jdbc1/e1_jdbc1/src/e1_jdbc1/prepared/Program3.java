package e1_jdbc1.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Program3 {

	//delete the data based on email
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
		Scanner sc=new Scanner(System.in);
		System.out.println("pls provide your email id to delete your data");
		String email=sc.next();
		
		
		
		
		//1.Load or register
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2.Establish the connection
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentjdbcdb", "root", "Lavanya@01");
		
		//3.create the statement
		PreparedStatement ps=c.prepareStatement("delete from student1 where email=?");    //placeholder====1st
		ps.setString(1, email) ; // setting-----placeholder position
		
		//4.execute the statement
		int a = ps.executeUpdate();
		
		
		///5.close the connection
		c.close();
		
		
		System.out.println("your "+email+" linked account is deleted "+a);
		
		
		
	}

}
