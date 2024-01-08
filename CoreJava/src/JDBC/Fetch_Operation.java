package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Framework.Employee;

import JDBC.Connection.Connectionprovider;

public class Fetch_Operation
{
	public static void main(String[] args) throws SQLException
	{
		Connection connection = null;
		try {
			
//            Class.forName("com.mysql.cj.jdbc.Driver");
//			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirstdb","root", "mysql");
			ArrayList<Employee> emplist = new ArrayList<Employee>();
			
			connection = Connectionprovider.getConnection();
			System.err.println(connection.getCatalog());
			String sqlQuery ="SELECT first_name,last_name,id FROM ankita";
			PreparedStatement ps= connection.prepareStatement(sqlQuery);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Employee emp=new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("first_name"));
				emplist.add(emp);
				
				
				
				//System.out.println(rs.getString(1));
//				String fname = rs.getString(2);
//				System.out.println(rs.getString("id"));
//				int id = rs.getInt(1);
//				System.out.println(id + " "+fname);
			}
//			System.out.println(emplist.toString());
			for (Employee employee : emplist) 
			{
				System.out.println(employee.toString());
			}
		}
		catch (Exception e) {
				e.printStackTrace(); 
			}
			finally{
				connection.close();

			}
	}}
//after executeQuery() it was store in ResultSet(is a interface)....it generate data in tebular form
//ResultSet generate multiple data ko fetch karne we use looping (while) 
//rs.next() it is method of ResultSet is use to check next row counter status every time
//getString(index) is use to fetch data
//getInt(index)