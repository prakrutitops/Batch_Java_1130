package com.a168;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

public class LogoImageEx 
{
	Frame frame;
	
	public LogoImageEx() 
	{
		// TODO Auto-generated constructor stub
		frame =new Frame();
		Image icon = Toolkit.getDefaultToolkit().getImage("E:\\photos\\add.png");
		frame.setIconImage(icon);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		
		new LogoImageEx();
		
	}
}
