package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import JDBC.Connection.Connectionprovider;

public class Textconnection 
{
	public static void main(String[] args) throws SQLException 
	{
		Connection connection=null;//Declaration;
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirstdb","root", "mysql");
			connection = Connectionprovider.getConnection();
			System.err.println(connection.getCatalog());
			/*******COMMUNICATION*********/
			String sqlQuery = "INSERT INTO student VALUES (10,'Ankii',21,'FEMALE',3534653),(11,'Rani',20,'FEMALE',243363)";
			PreparedStatement ps = connection.prepareStatement(sqlQuery);
			//prepared statement is an interface which is used to communicate with database
			//or we can say it is used to execute the queries  on db from java
			// PreparedStatement method accept query written in string and gives the object of ps
			boolean response = ps.execute();
			if(response == true)
			{
				System.out.println("ok");
			}
			else
			{
				System.out.println("failed");
			}
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		finally{
			connection.close();

		}
	}
}
