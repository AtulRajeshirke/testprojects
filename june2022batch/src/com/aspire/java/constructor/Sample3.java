package com.aspire.java.constructor;

public class Sample3
{
	public static void main(String[] args)
	{
		Sample2 object1= new Sample2();
		object1.addition();
		object1.multiplication();
		
		Sample2 object2 =new Sample2(10,20);
		object2.addition();
		object2.multiplication();
	}
	

}
