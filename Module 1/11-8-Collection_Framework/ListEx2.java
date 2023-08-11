package com.collection1;

import java.util.Iterator;
import java.util.LinkedList;

public class ListEx2 
{
	public static void main(String[] args) 
	{
		
		LinkedList<String>list =new LinkedList<>();
		
		list.add("java");
		list.add("android");
		list.add("flutter");
		list.addFirst("php");//linkedlist method
		list.addLast("testing");//linkedlist method
		
		System.out.println(list);
		
		Iterator<String> i = list.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}
}
