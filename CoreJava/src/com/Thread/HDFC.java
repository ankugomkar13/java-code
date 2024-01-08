package com.Thread;

public class HDFC extends Thread
{
	public static Bank bank; //obj as well as Variable
	double withdrawamount;// Instance variable
	
	public void run() //Predefined method of thread class
	{

		bank.withdraw(withdrawamount);
	}
	public static void main(String[] args)
	{
		bank=new Bank(); 
		
		HDFC hdfc_withdrawl_one=new HDFC();
		hdfc_withdrawl_one.withdrawamount=8000;
	//	hdfc_withdrawl_one.start();
		
		HDFC hdfc_withdrawl_two=new HDFC();
		hdfc_withdrawl_two.withdrawamount=8000;
		
		hdfc_withdrawl_one.start();
		hdfc_withdrawl_two.start();
		
		
	}
}
