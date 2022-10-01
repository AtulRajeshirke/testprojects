package com.aspire.java.arrey;

public class Arrey 
{
public static void main(String[] args) {
	int a=10;
	String b= "atul";
	int[] c= {1,2,3,4,5,6,7,8,9};
	String[] d= {"atul","prabhakar","rajeshirke"};
	int[] e= new int [5];
	e[0]=2;
	e[1]=3;
	e[2]=4;
	e[3]=6;
	e[4]=7;
	System.out.println(d[1]);
	a= c[3]+c[5];
	System.out.println(a);
	System.out.println("Length of c[]="+c.length);
	
	for(int i=0;i<=8;i++)
	{
		System.out.print(c[i]+" ");
	}
	System.out.println();
	
	
}
}
