package com.FileHandling;

import java.io.File;

public class FileCreation 
{
	public static void main(String[] args) 
	{
		try 
		{
			File file=new File("C:\\Users\\ACER\\Downloads\\Ankita");	
			boolean status=file.createNewFile();//for create new file
			if(status == true)
			{
				System.out.println("File have been created successfully");
			}
			else
			{
				System.out.println("Not able to creat file ");
			}
			boolean status1=file.exists();//for checking exists file is created or not
			if(status1 == true)
			{
				System.out.println("File does exists");
			}
			else
			{
				System.out.println("File does not exists ");
			}
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}










