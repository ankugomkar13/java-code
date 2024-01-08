package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TextConnection3 
{
		public static void main(String[] args) throws SQLException 
		{
			//scanner class use for making our static input to dynamic
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter your First name :");
			String firstname = sc.nextLine();
			System.out.print("Enter your Last name :");
			String Lastname = sc.nextLine();
			System.out.print("Enter your address :");
			String address = sc.nextLine();
			Connection connection=null;//Declaration;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirstdb","root", "mysql");
				System.err.println(connection.getCatalog());
				/*******COMMUNICATION*********/
				String sqlQuery = "INSERT INTO Ankita(first_name,last_name,address)VALUES"+"(?,?,?)";
				PreparedStatement ps = connection.prepareStatement(sqlQuery);
				ps.setString(1,firstname);
				ps.setString(2,Lastname);
				ps.setString(3,address);
				boolean response = ps.execute();
				System.out.println("successfully");
			} catch (Exception e) {

				e.printStackTrace(); 
			}
			finally{
				connection.close();

			}


		}}
