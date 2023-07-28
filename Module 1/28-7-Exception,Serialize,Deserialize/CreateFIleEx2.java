package com.a287;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class CreateFIleEx2 
{
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String name = sc.next();
		
		System.out.println("Enter Your Surname");
		String surname = sc.next();
		
		System.out.println("Enter Your Email");
		String email = sc.next();
		
		System.out.println("Enter Your City");
		String city = sc.next();
		
		try 
		{
			FileOutputStream fout = new FileOutputStream("E://sagar.txt");
			
			String name1 = "\n Your Name: ";
			String surname1 = "\n Your Surname: ";
			String email1 = "\n Your Email: ";
			String city1 = "\n Your City: ";
			
			fout.write(name1.getBytes());
			fout.write(name.getBytes());
			
			fout.write(surname1.getBytes());
			fout.write(surname.getBytes());
			
			fout.write(email1.getBytes());
			fout.write(email.getBytes());
			
			fout.write(city1.getBytes());
			fout.write(city.getBytes());
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}
		finally 
		{
			System.out.println("Executed");
			
		}
		
	}
}
