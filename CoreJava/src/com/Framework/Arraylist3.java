package com.Framework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import JDBC.Connection.Connectionprovider;

public class Arraylist3
{
	public static void main(String[] args) 
	{
		Connection connection = null;
		try {
			ArrayList<Student> stdlist = new ArrayList<Student>();
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root", "mysql");
				
//			StringBuffer sqlQuery = new StringBuffer();
//			sqlQuery.append("SELECT id,name,age ");
//			sqlQuery.append("FROM  studentinformation");
//			System.out.println(sqlQuery.toString());
			
			String sqlQuery ="SELECT id,name,age FROM studentinformation";
			PreparedStatement ps= connection.prepareStatement(sqlQuery);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Student std = new Student();
				std.setId(rs.getInt("id"));
				std.setName(rs.getString("name"));
				std.setAge(rs.getInt("age"));
			}
			for (Student student : stdlist)
			{
				System.out.println(student.toString());
			}
			
		} 
		catch (Exception e) 
		{
			
		}
	}

}
