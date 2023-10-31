package com.controller;

import java.util.Scanner;

import com.dao.MyDao;
import com.model.Person;

public class Delete 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Id");
		int id= sc.nextInt();
		
		Person p =new Person();
		p.setId(id);
		
		new MyDao().deletedata(p);
		
		
	}
}
