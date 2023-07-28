package com.a287;

public class Exception1 
{
	public static void main(String[] args) 
	{
		
		try
		{
			//logic 
			
			int data = 10/5;
			System.out.println(data);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally 
		{
			//finally is a block where all details are execute
			System.out.println("success");
		}
		
		
	}
}
