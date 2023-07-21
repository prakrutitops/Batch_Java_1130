package com.a217;

public class SvmEx 
{
	
	int id;
	String name;
	static String college="Atmiya";
	
	public SvmEx(int id,String name) 
	{
		// TODO Auto-generated constructor stub
		
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
	
	static void change()
	{
		college="Marwadi";
	}
	
	public static void main(String[] args) 
	{
		
		change();
		
		SvmEx s1 = new SvmEx(101, "A");
		SvmEx s2 =new SvmEx(102, "B");
		
		s1.display();
		s2.display();
			
	}
	
}
