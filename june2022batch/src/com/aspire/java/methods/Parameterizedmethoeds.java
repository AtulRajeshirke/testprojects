package com.aspire.java.methods;

public class Parameterizedmethoeds 
{
public static void addition(int a, int b)
{
	int sum=a+b;
	System.out.println(sum);
}
public static void sub(int a, int b)
{
	int sub=a-b;
	System.out.println(sub);	
}
public static void multi (int a, int b)
{
	int multi=a*b;
	System.out.println(multi);
}
public void division(int a, int b)
{
	int div=a/b;
	System.out.println(div);
}
public static void main(String[] args) 
{
	addition (10,20);
	addition (5,15);
	multi (10,15);
	sub(15,10);
	Parameterizedmethoeds object = new Parameterizedmethoeds ();
	object.division(20,10);
	
	
}
}
