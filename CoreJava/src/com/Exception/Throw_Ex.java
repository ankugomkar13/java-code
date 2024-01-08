package com.Exception;

public class Throw_Ex 
{
	public static void main(String[] args) 
	{
		int withdraw_amt=10000;
		int balance_amt=6000;
		try 
		{
			if(balance_amt<withdraw_amt)
			{
				throw new Exception("Insufficient Balance");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
}