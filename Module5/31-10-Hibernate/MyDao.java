package com.dao;



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
		
	
}
