package com.aspire.java.practice;

public class test {
	public static void main(String[] args)
	{
		System.out.println(" ******** parent ******");
		Parent p= new Parent();
		p.car();
		p.bunglow();
		
		System.out.println("***** child****");
		Child c= new Child();
		c.bunglow();
		c.car();
	}
	

}
