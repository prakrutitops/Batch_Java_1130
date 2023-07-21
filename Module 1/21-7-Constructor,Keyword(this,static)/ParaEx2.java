package com.a217;

public class ParaEx2 
{
		
		int id;
		String name;
		String college="Atmiya";
	
		public ParaEx2(int id,String name) 
		{
			// TODO Auto-generated constructor stub
			
			this.id=id;
			this.name=name;
		}
	
		void display()
		{
			System.out.println(id+" "+name+" "+college);
		}
		
		public static void main(String[] args) 
		{
			ParaEx2 p1 =new ParaEx2(101,"Sagar");
			ParaEx2 p2 =new ParaEx2(102,"Ankit");
		
			p1.display();
			p2.display();
		}
}
