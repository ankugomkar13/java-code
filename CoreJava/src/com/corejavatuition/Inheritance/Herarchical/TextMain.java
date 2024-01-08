package com.corejavatuition.Inheritance.Herarchical;

public class TextMain 
{
	public static void main(String[] args) {
		Child1 c=new Child1();
		c.messageFromChild1();
		c.messageFromParent();
		System.out.println();
		Child2 c1=new Child2();
		c1.messageFromChild2();
		c1.messageFromParent();
	}
}
