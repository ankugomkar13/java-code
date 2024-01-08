package com.Thread;

public class Bank 
{
	double balance=10000;
	synchronized public void withdraw(double amount) {
	if(amount<=balance) {
		System.out.println("please wait your transaction in process");
		balance-=amount;
		//balance=balance-amount;
		System.out.println("your transactoion is sucessfull" + balance);
	}
	else
	{
			System.out.println("your transaction is fail");
		}
	}
}
