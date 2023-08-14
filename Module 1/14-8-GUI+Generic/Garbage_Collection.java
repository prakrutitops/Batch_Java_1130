package com.a148;

public class Garbage_Collection 
{
	
	@Override
	protected void finalize() throws Throwable 
	{
		// TODO Auto-generated method stub
		//super.finalize();
	
		System.out.println("Garbage Collection called");
	}
	
	public static void main(String[] args) 
	{
		
		Garbage_Collection g1 = new Garbage_Collection();
		Garbage_Collection g2 = new Garbage_Collection();
		Garbage_Collection g3 = new Garbage_Collection();
	
	
		g1 =null;
		g2 =null;
		
		System.gc();
		
	}
}
