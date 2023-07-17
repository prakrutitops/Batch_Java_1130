package com.a177;

public class NestedIfEx 
{
	public static void main(String[] args) 
	{
		
		int age = 66;
		
		if(age>=18)
		{
				System.out.println("Eligible to vote");
		
				if(age>=60)
				{
					System.out.println("Senior Citizen Category");
				}
				else
				{
					System.out.println("You are not under Senior Citizen Category");
				}
		
		}
		else
		{
				System.out.println("Not Eligible to vote");
		}
		
	}
}
