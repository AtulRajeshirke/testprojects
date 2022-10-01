package com.aspire.java.inheritance.multilevelinheritance;

public class test {
	public static void main(String[] args) {
		System.out.println("*******parent*****");
		Parent p = new Parent();
		p.farm();
		Parent.car();
		
		System.out.println("******parentchild******");
		parentchild pc= new parentchild();
		pc.farm();
		pc.bunglow();
		parentchild.car();
		
		System.out.println("*******child******");
		child c = new child();
		c.bunglow();
		c.farm();
		c.jwellery();
		child.car();
		c.addition();
		}

}
