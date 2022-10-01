package com.aspire.java.logicaprograms;
//    *
//   **
//  *** 
// ****
//*****
//rows=5; space=5; stars=6
public class star6 
{
public static void main(String[] args) 
{
for(int rows=1; rows>=5; rows++)	
{
	for(int space=5; space<=rows; space--)
	{
		System.out.print(" ");
	}
	for(int star=1; star<=rows; star++)
	{
		System.out.print("*");
	}
	System.out.println();
	
}
}
}
