package com.a247;

class A1
{
	void a()
	{
		System.out.println("a");
	}
}
class B1 extends A1
{
	void b()
	{
		System.out.println("b");
	}
}

public class SingleInEx 
{
	public static void main(String[] args) 
	{
		
	
		B1 b =new B1();
		
		b.a();
		b.b();
		
	}
}
