package JDBC.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

import JDBC.constants;

public class Connectionprovider 
{
	public static Connection getConnection()
	{
		Connection connection=null;
	try {
		Class.forName(constants.MySql_Driver);
		connection = DriverManager.getConnection(constants.url,constants.userId,constants.password);
		
	} catch (Exception e) {
		e.getStackTrace();
	}
	return connection; // object return kar raha hai yaha Connection ka connection object hai
	}
}
