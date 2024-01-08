package JDBC;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import JDBC.Connection.Connectionprovider;


public class connection4 
{
	public static void main(String[] args) throws SQLException 
	{
		Connection connection = null;
		try 
		{
//			Class.forName(constants.MySql_Driver);
//			connection=DriverManager.getConnection(constants.url,constants.userId,constants.password);
//			System.err.println(connection.getCatalog());
			
			
			connection = Connectionprovider.getConnection();
			System.err.println(connection.getCatalog());
			StringBuffer sqlQuery = new StringBuffer();
			
			sqlQuery.append("SELECT id,first_name,last_name ");
			sqlQuery.append("FROM ankita ");
//			String sqlQuery ="SELECT id,first_name,last_name FROM ankita";
			System.out.println(sqlQuery.toString());
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace(); 
		}
		finally
		{
			connection.close();

		}
	}
}


