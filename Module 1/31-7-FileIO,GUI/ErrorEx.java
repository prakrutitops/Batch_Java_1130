package com.a317;

public class ErrorEx extends Exception
{
	static void arithmeticerror()
	{
		System.out.println("Arithmetic Exception Occured");
	}
	
	public static void main(String[] args) {
		
		arithmeticerror();
		
	}
}
