package com.a287;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeEx 
{
	public static void main(String[] args) {
		
		
		try 
		{
			ObjectInputStream 	in = new ObjectInputStream(new FileInputStream("E://ankit.txt"));
			Student s1 =(Student) in.readObject();
			System.out.println(s1.id+" "+s1.name);
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			System.out.println(e);
		} 
		
	}
}
