package com.aspire.java.arrey;

public class Multidimens 
{
public static void main(String[] args) 
{
	int row=2;
	int column = 3;
	int [][] a = new int [row][column];
	a[0][0]=1;
	a[0][1]=2;
	a[0][2]=3;
	a[1][0]=4;
	a[1][1]=5;
	a[1][2]=6;
	int [][]b= {{1,2,3,4},{5,6,7,8,9},{151,1,21,35}};
	System.out.println("printing []a=");
	
	for(int i=0; i<row; i++ )   //row
	{
		for( int j=0; j<column; j++ )    //column
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("prinitng int [][]b=");
	for(int i=0; i<b.length; i++ )   //row
	{
		for( int j=0; j<b[i].length; j++ )    //column
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	
			
}
}
}

