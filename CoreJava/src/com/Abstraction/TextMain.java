package com.Abstraction;

public class TextMain 
{
	public static void main(String[] args)
	{
		//Functional obj=new Square();
		//int b=obj.square(4);
		//System.out.println(b);
		Functional obj=n-> n*n;  //lambda Function
		System.out.println(obj.square(10));
		
	}
}

