package com.aspire.java.accessspecifiers;

public class sample {
	private void method1()
	{
		System.out.println("private method");
	}
	protected void method2()
	{
		System.out.println("protected method");
	}
	 void method3()
	{
		System.out.println("default method");
	}
	public void method4()
	{
		System.out.println("public  method");
	}
	public static void main(String[] args) 
	{
	//same class
		sample object = new sample();
		object.method1();
		object.method2();
		object.method3();
		object.method4();
	}
	
	
	
	
	
	
	

}
