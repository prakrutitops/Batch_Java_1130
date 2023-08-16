package com.a168;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class ImageEx extends Canvas
{
	
	
	@Override
	public void paint(Graphics g) 
	{
		// TODO Auto-generated method stub
		  Toolkit t=Toolkit.getDefaultToolkit();  
	      Image i=t.getImage("E:\\photos\\add.png");  
	      g.drawImage(i, 120,100,this);  
	}
	
	
	public static void main(String[] args) 
	{
		
		ImageEx i =new ImageEx();
		JFrame frame = new JFrame();
		frame.add(i);
		frame.setSize(400,400);  
	    frame.setVisible(true);  
	}
	
}
