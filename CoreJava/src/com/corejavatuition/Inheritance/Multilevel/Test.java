package com.corejavatuition.Inheritance.Multilevel;

public class Test
{
	public static void main(String[] args) 
	{
		Child c=new Child();
		c.messageFromChild();
		c.messageParent();
		c.messageGrandParent();
		
		Parent p=new Parent();
		p.messageGrandParent();
		p.messageParent();
	}
}
