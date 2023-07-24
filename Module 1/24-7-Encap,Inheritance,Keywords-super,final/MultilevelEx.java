package com.a247;

class P
{
	void p1()
	{
		System.out.println("P Executed");
	}
}
class Q extends P
{
	void q1()
	{
		System.out.println("Q Executed");
	}
}
class R extends Q
{
	void r1()
	{
		System.out.println("R Executed");
	}
}

public class MultilevelEx 
{
	public static void main(String[] args) 
	{
		R r1 =new R();
		
		r1.p1();
		r1.q1();
		r1.r1();
		
	}
}
