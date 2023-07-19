package com.a197;

public class Student 
{
	int id;
	String name;
	
	
	public static void main(String[] args) 
	{
		
		//Classname objname = new Classname();
		
		//object creation
		Student s1 = new Student();
		
		Student s2 = new Student();
		
		
		//value assign to object using variable
		s1.id=101;
		s1.name="Ankit";
		
		s2.id=102;
		s2.name="Sagar";
	
		
		//Print Details
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
		
	}
}
