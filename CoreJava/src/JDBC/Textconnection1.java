package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import JDBC.Connection.Connectionprovider;

public class Textconnection1 {
	public static void main(String[] args) throws SQLException {
		Connection con = null;// Declaration;
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter your name :");
			String name = sc.nextLine();

			System.out.println("Enter your gender name :");
			String gender = sc.nextLine();
			System.out.println("Enter your phone :");
			int phone = sc.nextInt();
			System.out.println("Enter your id :");
			int id = sc.nextInt();
			System.out.println("Enter your age :");
			int age = sc.nextInt();
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirstdb", "root", "mysql");
			con = Connectionprovider.getConnection();
			System.err.println(con.getCatalog());

			String sqlQuery = "INSERT INTO student(id,name,age,gender,phone)VALUES" + "(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sqlQuery);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setString(4, gender);
			ps.setInt(5, phone);
			ps.execute();
			System.out.println("successfully");

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			con.close();

		}
	}

}
