package com.aspire.java.logicaloops;

public class Do_while2 {
	public static void main(String[] args) {
		int passingmarks=40;
		int obtainedmarks=10;
		do
		{
			System.out.println("appear in the exam");
			obtainedmarks=obtainedmarks+5;
		}
		while(obtainedmarks<=passingmarks);
		
	}

}
