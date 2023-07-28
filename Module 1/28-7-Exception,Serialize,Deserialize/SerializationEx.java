package com.a287;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationEx 
{
	public static void main(String[] args) 
	{
		
		try 
		{
			Student s1 =new Student(101,"tops");
			FileOutputStream fout = new FileOutputStream("E://ankit.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}
		
	}
}
