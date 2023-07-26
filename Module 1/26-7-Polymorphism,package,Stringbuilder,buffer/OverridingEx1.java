package com.a267;

class Bank
{
	int rate()
	{
		return 0;
	}
}
class Sbi extends Bank
{
	int rate()
	{
		return 7;
	}
}
class Icici extends Bank
{
	int rate()
	{
		return 8;
	}
}
class Axis extends Bank
{
	int rate()
	{
		return 9;
	}
}

public class OverridingEx1 	
{
	public static void main(String[] args) 
	{
		Bank b; //refrence variable
		
		b = new Sbi();
		System.out.println(b.rate());//7
		
		b = new Icici();
		System.out.println(b.rate());//8
		
		b = new Axis();
		System.out.println(b.rate());//9
	}
}
