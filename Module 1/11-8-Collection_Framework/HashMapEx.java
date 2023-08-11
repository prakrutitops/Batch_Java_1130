package com.collection1;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx 
{
	public static void main(String[] args) 
	{
		
		HashMap<String,String> hashmap = new HashMap<>();
		
		//put,get
		
		hashmap.put("A" , "1");
		hashmap.put("B" , "2");
		hashmap.put("C" , "3");
		hashmap.put("D" , "4");
		
		//System.out.println(hashmap);
		
		for(Map.Entry m : hashmap.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}
}
