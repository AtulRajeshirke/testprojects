package com.aspire.java.logicaprograms;
//123--->321
public class reversenumber {
	public static void main(String[] args) 
	{
		int num=123456789;
		int rev=0;
		int rem = 0;
		while(num>0)
		{
			
			rem=num%10;
			num=num/10;
			rev = rem*10;
			rev=rev/10;
			System.out.print(rev);
		}
	}

}
