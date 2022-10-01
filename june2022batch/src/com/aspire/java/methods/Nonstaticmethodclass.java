package com.aspire.java.methods;

public class Nonstaticmethodclass 
{
public  void method11()
{
	System.out.println("non static method11 from same class");
}
public void method12()
{
	System.out.println("non static method12 from same class");
}
public static void method13()
{
	System.out.println("non static method13 from same class");
}
public static void main(String[] args) 
{
	//classname objectname = new classname();
	Nonstaticmethodclass object= new Nonstaticmethodclass();
	object.method11();
	object.method12();
	method13();
	method13();
	differentclass diffclassobject=new differentclass();
	diffclassobject.method14();      //non static method eith object name reference
	diffclassobject.method15();
	differentclass.method4();
	differentclass.method3();      //static method with class name reference
	
	
	
}
}
