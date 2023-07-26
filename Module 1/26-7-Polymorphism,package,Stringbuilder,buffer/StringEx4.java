package com.a267;

public class StringEx4 
{
	public static void main(String[] args) {
		
		
		String s1 ="sachin";
		String s2 = new String("sachin");
		String s3="saurav";
		String s4 ="sachin";
		String s5="SACHIN";
		
		//Equals
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s5));
		System.out.println("----------------------------");
		//Equalsignorecase
		System.out.println(s1.equalsIgnoreCase(s5));
		System.out.println("----------------------------");
		//COMPARETO
		
		System.out.println(s1.compareTo(s4));//0
		System.out.println(s1.compareTo(s2));//0
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s5));
		System.out.println("----------------------------");
		
		//==
		System.out.println(s1==s4);
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s5);
	}
}
