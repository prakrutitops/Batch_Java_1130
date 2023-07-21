package com.a217;

public class CopyConEx 
{
	int id;
	String name;
	
	CopyConEx(int i,String n) 
	{
		// TODO Auto-generated constructor stub
		id=i;
		name=n;
	}
	
	CopyConEx(CopyConEx c)
	{
		id = c.id;
		name = c.name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) 
	{
		CopyConEx c1 =new CopyConEx(101,"A");
		CopyConEx c2 =new CopyConEx(c1);
		
		c1.display();
		c2.display();
	}
}
