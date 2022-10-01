package com.aspire.java.constructor;

public class Sample {
	int a;
	float b;
	char c;
	boolean d;
	public void method()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		Sample object= new Sample();
		object.method();
		
	}

}
