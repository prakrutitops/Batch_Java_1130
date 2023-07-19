package com.a197;

public class ConEx2 
{
	
	static int count = 0;
	
	//Without Static it will assign new memory everytime
	//With Static it will reuse old allocated memory
	
	public ConEx2() 
	{
		// TODO Auto-generated constructor stub
		
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) 
	{
		
		ConEx2 c1 =new ConEx2();
		ConEx2 c2 =new ConEx2();
		ConEx2 c3 =new ConEx2();
	}
}
