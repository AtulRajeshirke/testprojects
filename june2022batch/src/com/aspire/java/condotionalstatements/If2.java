package com.aspire.java.condotionalstatements;

public class If2 {
	public static void main(String[] args) {
		int a=4, b=6, c=10;
		if(a>b&&a>c)
		{
			System.out.println("both conditions are true");
		}
		if(!(a<b||a>c))
		{
			System.out.println("either of condition is true");
		}
	}

}
