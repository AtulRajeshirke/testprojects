package com.aspire.java.condotionalstatements;
//exam result
//>100, >=75,>=60, >=40, <40
public class Else_if {
public static void main(String[] args) {
	int obtainedmarks=97;
	int passingmarks=40;
	if(obtainedmarks>100)
	{
		System.out.println("invalid marks");
	}
	else if(obtainedmarks>=75)
	{
		System.out.println("distinction");
	}
	else if(obtainedmarks>=60)
	{
		System.out.println("first class");
	}
	else if(obtainedmarks>=40)
	{
		System.out.println("passed");
	}
	else
	{
		System.out.println("failed");
	}
}
}
