package com.a267;

public class StringEx5 
{
	public static void main(String[] args) {
		
		
		
		String s1 ="sachin";
		String s2 = new String("sachin");
		String s3="saurav";
		String s4 ="  sachin  ";
		String s5="TOPS";
		String s6 = "kotlin is a programming language. kotlin is open source .kotlin is worldwide";
		
		System.out.println(s1.toUpperCase());
		System.out.println(s5.toLowerCase());
		System.out.println(s4.trim());
		System.out.println(s1.startsWith("sa"));
		System.out.println(s1.endsWith("n"));
		System.out.println(s3.charAt(0));
	
		System.out.println(s6.replace("kotlin", "java"));
	}
}
