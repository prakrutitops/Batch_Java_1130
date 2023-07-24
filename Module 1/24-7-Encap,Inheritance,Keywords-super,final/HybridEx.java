package com.a247;

class A
{
	void a()
	{
		System.out.println("A Executed");
	}
}
class B extends A
{
	void b()
	{
		System.out.println("B Executed");
	}
}
interface C
{
	void c();
}
class D extends B implements C
{
	void d()
	{
		System.out.println("D Executed");
	}

	@Override
	public void c() 
	{
		// TODO Auto-generated method stub
		System.out.println("C Executed");
	}
}

public class HybridEx 
{
	public static void main(String[] args) 
	{
		D d1 =new D();
		d1.a();
		d1.b();
		d1.c();
		d1.d();
	}
}
