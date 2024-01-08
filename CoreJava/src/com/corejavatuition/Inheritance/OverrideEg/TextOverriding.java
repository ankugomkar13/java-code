package com.corejavatuition.Inheritance.OverrideEg;

public class TextOverriding 
{
	public static void main(String[] args) 
	{
		Child_Ord C=new Child_Ord();
		C.eyeColour();
		C.hand();
		Parent_Ord P=new Parent_Ord();
		P.eyeColour();
	}
}
