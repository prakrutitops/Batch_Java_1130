package com.collection1;

import java.util.Vector;

public class VectorEx1 
{
	public static void main(String[] args) 
	{
		
		Vector v =new Vector<>(5);
		
		v.addElement("a");
		v.addElement("b");
		v.addElement("c");
		v.addElement("d");
		v.addElement("a");
		v.addElement("d");
		v.addElement("a");
		v.addElement("d");
		v.addElement("a");
		v.addElement("d");
		v.addElement("a");
		
		
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		if(v.contains("e"))
		{
			System.out.println("Available");
		}
		else
		{
			System.out.println("Not Available");
		}
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
	}
}
