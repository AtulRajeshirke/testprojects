package com.aspire.java.constructor;

public class Sample2 {
	int a;
	int b;
	Sample2()
	{
		a=50;
		b=100;
		
	}
	Sample2(int c, int d)
	{
		a=c;
		b=d;
	}
	public void addition()
	{
		int add=a+b;
		System.out.println("addition of a& b=");
	}
	public void multiplication()
	{
		int multi=a*b;
		System.out.println("multiplication of a & b="+multi);
		
	}

}
