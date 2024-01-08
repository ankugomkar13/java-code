package com.Abstraction;

public interface InterfaceEx 
{
	public void input();
	default void read()
	{
		System.out.println("Hiii");
	}
}
