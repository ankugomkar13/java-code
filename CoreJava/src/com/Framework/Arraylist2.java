package com.Framework;

import java.util.ArrayList;

public class Arraylist2
{
	public static void main(String[] args) 
	{
		try 
		{
			ArrayList<Employee> emplist = new ArrayList<Employee>();
			Employee emp1=new Employee();
			emp1.setId(12);
			emp1.setName("Ankita");
			emplist.add(emp1);
			Employee emp2=new Employee();
			emp2.setId(11);
			emp2.setName("hitanshu");
			emplist.add(emp2);
			for (Employee employee : emplist) 
			{
				System.out.println(employee.toString());
			}
			
			
			
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
	}
}
