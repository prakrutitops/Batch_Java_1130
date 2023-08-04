package com.a48;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class RadioButtonEx implements ItemListener
{
	JFrame frame;
	JRadioButton rb1,rb2;
	
	public RadioButtonEx()
	{
		frame =new JFrame();
		
		rb1 =new JRadioButton("Male");
		rb2 =new JRadioButton("Female");
	
		ButtonGroup bg =new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		rb1.addItemListener(this);
		rb2.addItemListener(this);
		
		frame.add(rb1);
		frame.add(rb2);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new RadioButtonEx();
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==rb1)
		{
			JOptionPane.showMessageDialog(frame,"You are Male");
		}
		else if(e.getSource()==rb2)
		{
			JOptionPane.showMessageDialog(frame,"You are Female");
		}
	}
	
}
