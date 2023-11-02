package com.controller;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Util;
import com.model.Address;
import com.model.Person;

public class MainClass 
{
	public static void main(String[] args) {
		
		Session sess =  new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		
		Person p =new Person();
		Address a =new Address();
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String name = sc.next();
		p.setName(name);
		
		System.out.println("Enter Your City");
		String city = sc.next();
		a.setAddress(city);

		
		a.setPerson(p);
		sess.save(p);
		sess.save(a);
		tr.commit();
		sess.close();
	}
}
