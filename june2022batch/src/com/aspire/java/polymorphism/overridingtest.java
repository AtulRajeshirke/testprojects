package com.aspire.java.polymorphism;

public class overridingtest 
{
public static void main(String[] args) {
	System.out.println("********overridingparent*******");
	overridingparent p= new overridingparent();
	p.bunglow();
	p.farm();
	p.jwellery();
	
	System.out.println("******Overrridingchild*******");
	Overrridingchild c= new Overrridingchild();
	c.bunglow();
	c.farm();
	c.jwellery();
	c.car();
}
}
