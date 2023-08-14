package com.a148;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{

	int sid;
	String sname;
	
	public Student(int id,String name) 
	{
		// TODO Auto-generated constructor stub
		this.sid=id;
		this.sname=name;
	}
	
	
	@Override
	public int compareTo(Student o) 
	{
		int value=0;
		
		if(this.sid>o.sid)
		{
			return 1;
		}
		else if(this.sid<o.sid)
		{
			return -1;
		}
		else if(this.sid==o.sid)
		{
			return 0;
		}
		
		return value;
		
		
		
	}
	
}

public class ComparableEx 
{
	public static void main(String[] args)
	{
		Student s1 = new Student(15, "Parth");
		Student s2 = new Student(10, "Jay");
		Student s3 = new Student(1, "Dhaval");
		Student s4 = new Student(12, "RAhul");
		Student s5 = new Student(7, "Tapan");
		
		ArrayList<Student>al = new ArrayList<>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		Collections.sort(al);
		
		
		for(Student s : al)
		{
			System.out.println(s.sid+" "+s.sname);
		}
	}
}
