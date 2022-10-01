package com.aspire.java.superthiskeyword;

public class Child extends Parent
{
	int a =50;
	int b=60;
	
	public void method1()
	{
		int a=70;
		int b=80;
		int sum = super.a+this.b+b+super.b;
		System.out.println(sum);
		
		System.out.println("a="+a);     //local value taken
		System.out.println("Global a from child class="+this.a);
		System.out.println("Global b from child class="+this.b);
		System.out.println("Global a from parent class="+super.a);
		
	}
	public static void main(String[] args) 
	{
		Child Child = new Child();
		Child.method1();
		sample s= new sample();
		System.out.println(s.a);
		System.out.println(sample.b);
	}
}
