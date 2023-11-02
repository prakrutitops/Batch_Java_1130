package com.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Util;
import com.model.Person;

public class MyDao 
{
	
	public void insertdata(Person p)
	{
		Session sess = new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		sess.save(p);
		tr.commit();
		sess.close();
	}
	public void deletedata(Person p)
	{
		Session sess = new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		sess.delete(p);
		tr.commit();
		sess.close();
	}
	public void updatedata(Person p)
	{
		Session sess = new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		sess.update(p);
		tr.commit();
		sess.close();
	}
	
	public List<Person> viewdata()
	{
		Session sess = new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		List<Person>list = sess.createQuery("from Person").list();
		return list;
	}
	
	public Person getsingle(Person p)
	{
		Session sess = new Util().getconnect();
		Transaction tr = sess.beginTransaction();
		Person person = (Person) sess.get(Person.class, p.getId());
		return person;
	}
		
	
}
