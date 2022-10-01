package com.aspire.java.abstractclass;

public class Grandchild extends Child
{

	
	public void farm() 
	{
		
		System.out.println("Grandchild farm=01");
	}
	public void addition()
	{
		int sum = a+b;
		System.out.println(sum);
		
	}
	public static void main(String[] args) 
	{
		Grandchild gc = new Grandchild();
		gc.bunglow();
		gc.car();
		gc.farm();
		gc.addition();
	}
	
	

	
	
}
