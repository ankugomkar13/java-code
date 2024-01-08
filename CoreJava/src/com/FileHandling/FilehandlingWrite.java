package com.FileHandling;

import java.io.File;
import java.io.FileWriter;

public class FilehandlingWrite 
{
	public static void main(String[] args) 
	{
		try {
				File obj=new File("C:\\Users\\ACER\\Downloads\\Anku4");
				FileWriter file=new FileWriter(obj);
				file.write("I am Ankita Gomkar,Currently I am Studying in Priyadarshini Bhagwati College of Engineering");
				file.close();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
