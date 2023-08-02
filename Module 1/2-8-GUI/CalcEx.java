package com.a28;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalcEx implements ActionListener
{
	JFrame frame;
	JTextField tf1,tf2,tf3;
	JButton btn1,btn2;
	
	public CalcEx() 
	{
		// TODO Auto-generated constructor stub
	
		frame =new JFrame();
		
		tf1 =new JTextField();
		tf1.setBounds(120, 10, 186, 20);
		
		tf2 =new JTextField();
		tf2.setBounds(120, 50, 186, 20);
		
		tf3 =new JTextField();
		tf3.setBounds(120, 90, 186, 20);
		tf3.setEditable(false);
		
		btn1 =new JButton("+");
		btn1.setBounds(120, 135, 53, 38);
		
		btn2 =new JButton("-");
		btn2.setBounds(212, 135, 53, 38);
		
		//2nd way to set button's click event
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		
		// How to set Button's Click event 1st way - start
		
		/*
		 * btn1.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { // TODO Auto-generated
		 * method stub String a = tf1.getText().toString(); String b =
		 * tf2.getText().toString();
		 * 
		 * int c = Integer.parseInt(a)+Integer.parseInt(b);
		 * 
		 * tf3.setText(String.valueOf(c)); } });
		 * 
		 * btn2.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * 
		 * String a = tf1.getText().toString(); String b = tf2.getText().toString();
		 * 
		 * int c = Integer.parseInt(a)-Integer.parseInt(b);
		 * 
		 * tf3.setText(String.valueOf(c));
		 * 
		 * } });
		 */
		
		// How to set Button's Click event 1st way - End
		
		
		
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(btn1);
		frame.add(btn2);
		frame.setSize(350,350);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new CalcEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
		 String a = tf1.getText().toString(); 
		 String b =tf2.getText().toString();
		 int c=0;		  
	
		if(e.getSource()==btn1)
		{
			c = Integer.parseInt(a)+Integer.parseInt(b);
		}
		if(e.getSource()==btn2)
		{
			c = Integer.parseInt(a)-Integer.parseInt(b);
		}
		
		tf3.setText(String.valueOf(c));
	}
	
}
