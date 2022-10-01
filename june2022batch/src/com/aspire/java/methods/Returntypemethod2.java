package com.aspire.java.methods;

public class Returntypemethod2 
{
	public static int addition(int a, int b)
	{
		int add=a+b;
		return add;
	}
	public int substraction(int a, int b)
	{
		int sub=a-b;
		return sub;
	}
	public static String sample()
	{
		int a=10;
		short b=20;
		byte c=30;
		long d=40;
		float e=50.2f;
		double f=60.3;
		char g='z';
		boolean h=true;
		String i="Aspire";
		return i;
		
		
	}
public static void main(String[] args)
{
	int x= addition(100,20);
	Returntypemethod2 object= new Returntypemethod2();
	int y = object.substraction(100,20);
	int multi = x*y;
	System.out.println(multi);
	
	
	
}
}
