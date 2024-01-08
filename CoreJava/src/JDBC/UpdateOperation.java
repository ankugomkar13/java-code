package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import JDBC.Connection.Connectionprovider;

public class UpdateOperation
{
	public static void main(String[] args) throws SQLException
	{
		Connection connection = null;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter first_name");
			String first_name = sc.nextLine();
			System.out.println("enter last_name ");
			String last_name = sc.nextLine();
			System.out.println("enter address");
			String address = sc.nextLine();
			
			System.out.println(first_name);
			System.out.println(last_name);
			System.out.println(address);
			
			
//		Class.forName("com.mysql.cj.jdbc.Driver"); 
//		connection = DriverManager.getConnection("jdbc:mysql://localhost/myfirstdb","root","mysql");
		connection = Connectionprovider.getConnection();
		String sqlQuery = "UPDATE ankita"+ " SET first_name=?,last_name=?,address=?" + "WHERE id = '1'";
		PreparedStatement ps= connection.prepareStatement(sqlQuery);
		ps.setString(1, first_name);
		ps.setString(2,last_name);
		ps.setString(3,address);
		ps.execute();
		System.out.println("successfully");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
			
		}



	
	}
}
