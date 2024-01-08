package com.Thread;

public class TextMain 
{
	public static void main(String[] args) 
	{
		thread_method t1=new thread_method();
		thread_method t2=new thread_method();
		 t1.start();
		 t2.start();
		
	}
}
