package com.Thread;

public class Threadex
{
	synchronized public static void bal()
	{
		int amt=2000;
		int bal=3000;
		if(amt<=bal)
		{
			System.out.println("Transcation successfully");
		}
		else
		{
			System.out.println("Transcation Not successfully");
		}
	}
	
}
