package com.collection1;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx1 
{
	public static void main(String[] args)
	{
		
		//E - Entity-[datatype,model]
		
		ArrayList<String> arr1 =new ArrayList<>();
		
		//add
		
		arr1.add("java");
		arr1.add("php");
		arr1.add("python");
		arr1.add("android");
		
		
		ArrayList<String> arr2 =new ArrayList<>();
		
		//add
		
		arr2.add("android");
		arr2.add("ios");
		arr2.add("flutter");
		/*
		 * arr1.addAll(arr2); arr1.remove(2);//index arr1.remove("ios");//object wise
		 * 
		 * arr1.removeAll(arr2)
		 */
		//System.out.println(arr1);
		
		arr1.retainAll(arr2);//common detail
	
		Iterator<String> i = arr1.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	
	}
}
