package com.a317;

class P1 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println("P1 : "+i);
		}
	}
	
}
class Q1 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println("Q1 : "+i);
		}
	}
	
}
public class ThreadEx2 
{
	public static void main(String[] args) {
		
		
		Thread t1 =new Thread(new P1());
		Thread t2 =new Thread(new Q1());
	
		t1.start();
		t2.start();
	}
}
