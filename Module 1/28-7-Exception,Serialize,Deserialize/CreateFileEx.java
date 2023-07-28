package com.a287;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFileEx 
{
	
	public static void main(String[] args) 
	{
		
		
		try 
		{
			String s1 ="Welcome to tops";
			FileOutputStream fout = new FileOutputStream("E://data.txt");
			fout.write(s1.getBytes());
			
			
		}
		
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
			
		}
		finally 
		{
			System.out.println("Success");
		}
		
	
	}
	
}
