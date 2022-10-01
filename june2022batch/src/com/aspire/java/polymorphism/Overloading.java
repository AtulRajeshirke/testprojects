package com.aspire.java.polymorphism;

public class Overloading extends Parent
{
	int i=10;
	int j=20;
	
	
public void addition()
{
	int sum= i+j;
	System.out.println(sum);
}
public void addition(int a)
{
	int sum= i+a;
	System.out.println(sum);
}
public void addition(int a, int b)
{
	int sum=a+b;
	System.out.println(sum);
}
public void addition(int a, int b, int c)
{
	int sum=a+b+c;
	System.out.println(sum);
}
public void addition(float a)
{
	
}
public static void main(String[] args) 
{
	Overloading object = new Overloading();
	object.addition();
	object.addition(2);
	object.addition(5, 10);
	object.addition(15, 20, 25);
}
}
