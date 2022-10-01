package com.aspire.java.constructor;

public class Databasetest {
	public static void main(String[] args) {
		Database Atul = new Database ();
		Atul.name="Atul Rajeshirke";
		Atul.mono=739181698;
		Database.principlename="Amey";
		Database.collegename="sps";
		
		Database Aishwarya= new Database();
		Aishwarya.name="Aishwarya Satturwar";
		Aishwarya.mono=86525646;
		
		
		//methodcalling
		Atul.collegedata();
		Aishwarya.collegedata();
	
		
	}

}
