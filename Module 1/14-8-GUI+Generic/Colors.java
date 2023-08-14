package com.a148;


enum Student1
{
	//constant
	John(10), Bella(11), Sam(12), Viraaj(13);
	
	private int age;
	
	private Student1(int age) 
	{
		// TODO Auto-generated constructor stub
		this.age=age;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}
	

	
	
}

public class Colors 
{
	public static void main(String[] args) 
	{
			System.out.println(Student1.John.getAge()+"  years ");
	}
}
