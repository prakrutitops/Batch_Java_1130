package com.controller;

import java.util.List;

import com.dao.MyDao;
import com.model.Person;

public class View 
{
	public static void main(String[] args) 
	{
		List<Person>list = new MyDao().viewdata();
		
		System.out.println("\t ID \t NAME");
		
		
		
		for(Person p : list)
		{
			System.out.println("\t "+p.getId()+"\t "+p.getName());
		}
	}
}
