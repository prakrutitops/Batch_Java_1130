package com.a317;

public class ThrowEx 
{
	
	
	public static void validate(int age) throws ErrorEx
	{
		
		if(age>18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			//throw new ArithmeticException("Not Valid");
		
			throw new ErrorEx();
		}
		
	}
	
	public static void main(String[] args) 
	{
		
		try {
			validate(15);
		} catch (ErrorEx e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
