package com.a217;

public class ParameterizedConEx 
{
	//Variables - Data Members
	//Global
	int id;
	String name;
	
	//Parameters 
	//Local
	public ParameterizedConEx(int id,String name) 
	{
		//refrence keyword - this
		
		this.id = id;
		this.name = name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) 
	{
		
		
		ParameterizedConEx p1 = new ParameterizedConEx(101,"A");
		ParameterizedConEx p2 = new ParameterizedConEx(102,"B");
		
		p1.display();
		p2.display();
		
	}
	
}
