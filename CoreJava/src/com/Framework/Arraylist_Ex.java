package com.Framework;

import java.util.ArrayList;

public class Arraylist_Ex 
{
	public static void main(String[] args) 
	{
		try 
		{
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<20;i++)
			{
				list.add(i);
			}
			for(Integer integer :list)
			{
				System.out.println(integer);
			}
			System.out.println();
			System.out.println(list.size());
			System.out.println(list.toString());
		} catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
