package com.a247;

class MyColor
{
	String color = "black";
}
class MyColor2 extends MyColor
{
	String color = "white";
	
	void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class SuperEx 
{
	public static void main(String[] args) 
	{
	
		MyColor2 m =new MyColor2();
		m.display();
		
	}
}
