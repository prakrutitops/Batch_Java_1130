package com.collection1;

import java.util.ArrayList;
import java.util.HashSet;

public class SetEx2 
{
	public static void main(String[] args) {
		
		//set will remove duplicate elements
		
		HashSet hashset =new HashSet();
		
		
		  hashset.add("android"); 
		  hashset.add("java"); 
		  hashset.add("flutter");
		  hashset.add("php");
		  hashset.add("ios");
		  hashset.add("python");
		  hashset.add("flutter"); 
		  hashset.add("java");
		 
		
		/*
		 * hashset.add(1); hashset.add(7); hashset.add(5); hashset.add(9);
		 * hashset.add(2); hashset.add(4);
		 */
		
		/*
		 * hashset.add('A'); hashset.add('E'); hashset.add('C'); hashset.add('D');
		 */
		
		System.out.println(hashset);
	}
}
