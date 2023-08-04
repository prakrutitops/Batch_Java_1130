package com.a48;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FrameOptions extends WindowAdapter
{
	JFrame frame;
	
	public FrameOptions() 
	{
		// TODO Auto-generated constructor stub
		 
		frame =new JFrame();
		frame.addWindowListener(this);
		
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	
	}
	public static void main(String[] args) 
	{
		new FrameOptions();
	}
	
	@Override
	public void windowClosing(WindowEvent e) 
	{
		
		int a = JOptionPane.showConfirmDialog(frame,"Are you sure you want to exit?");
		
		if(a==JOptionPane.YES_OPTION)
		{
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if(a==JOptionPane.CANCEL_OPTION)
		{
			frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
		if(a==JOptionPane.NO_OPTION)
		{
			frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
		
	}
}
