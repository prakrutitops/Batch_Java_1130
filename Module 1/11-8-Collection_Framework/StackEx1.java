package com.collection1;

import java.util.Stack;

public class StackEx1 
{
	
	//push,pop
	
	static void pushdata(Stack st,Integer i)
	{
		st.push(i);
		
		System.out.println(i);
		System.out.println(st);
	}
	static void pop(Stack st)
	{
		Integer i = (Integer) st.pop();
		
		System.out.println(i);
		System.out.println(st);
	}
	
	public static void main(String[] args) {
		
		Stack st =new Stack<>();
		
		pushdata(st,10);
		pushdata(st,20);
		pushdata(st,30);
		pushdata(st,40);
		
		try
		{
			pop(st);
			pop(st);
			pop(st);
			pop(st);
			pop(st);
		}
		catch(Exception e)
		{
			System.out.println("No data");
		}
		
		
		
		
	}
	
}
