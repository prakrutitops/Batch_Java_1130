package com.a148;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DigitalWatchEx implements Runnable
{
	JFrame frame;
	JButton btn;
	Thread t=null;
	int hours=0, minutes=0, seconds=0;  
	String timeString = "";  
	
	public DigitalWatchEx() 
	{
		// TODO Auto-generated constructor stub
	
		frame =new JFrame();
		
		t = new Thread(this);  
	    t.start();  
		
		btn =new JButton("");
		btn.setBounds(100,100,100,50);  
		
		frame.add(btn);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		
		new DigitalWatchEx();
		
		
	}

	@Override
	public void run() 
	{
		
		while(true)
		{
			Calendar cal = Calendar.getInstance(); 
			
			hours = cal.get(Calendar.HOUR_OF_DAY);
			 if (hours > 12) hours -= 12;  
			 
			minutes = cal.get(Calendar.MINUTE);
			
			seconds = cal.get(Calendar.SECOND);
			
			SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
            Date date = cal.getTime();  
            timeString = formatter.format(date);  
           
            printtime();
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			
			 
			 
		}
		
		
		
	}
	public void printtime()
	{
		btn.setText(timeString);  
	}
}
