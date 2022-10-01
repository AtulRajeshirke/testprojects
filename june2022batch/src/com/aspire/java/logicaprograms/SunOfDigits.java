package com.aspire.java.logicaprograms;

import java.util.Scanner;

public class SunOfDigits {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter any no to get sum of its digit=");
		
		int num = scan.nextInt();
		int sum = 0;
		
		while(num>0)
		{
			sum = sum+num%10;
		
		num =num/10;
		}
		
		
		System.out.println(sum);
		System.out.println(num);
		
	}

}
