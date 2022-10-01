package com.aspire.java.methods;

import com.aspire.java.logicaloops.For1;
import com.aspire.java.methodsfromdifferentpackage.method;

public class Staticmethodclass 
{
   public static void method1()    //smsc
   {
	   System.out.println("static method1 from same class");
   }
   public static void method2()
   {
	   System.out.println("static method2 from same class");
   }
   
   public static void main(String[] args)
   {
	System.out.println("program starts here");
	
	method1();
	method2();
	method1();
	differentclass.method3();
	differentclass.method4();
	method.method5();
	method.method5();
	
	
	System.out.println("program ends here");
}
}
