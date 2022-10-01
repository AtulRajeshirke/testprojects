package com.aspire.java.constructor;

public class Database
{
	
	String name;
	int mono;
	static String principlename;
	static String collegename;
	//variable initialization
	Database()
	{
		System.out.println("********constructor body********");
		System.out.println(name);
		System.out.println(mono);
		System.out.println(principlename);
		System.out.println(collegename);
	}
	public void collegedata()
	{
		System.out.println("*******methodbody*******");
		System.out.println(name);
		System.out.println(mono);
		System.out.println(principlename);
		System.out.println(collegename);	
	}

}
