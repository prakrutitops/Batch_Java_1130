package com.pages;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainClass implements ActionListener
{
	JFrame mainframe;
	JButton insertbtn,viewbtn,updatebtn,deletebtn;
	
	
	public MainClass() 
	{
		// TODO Auto-generated constructor stub
		
		mainframe =new JFrame();
		
		insertbtn =new JButton("INSERT");
		viewbtn =new JButton("VIEW");
		updatebtn =new JButton("UPDATE");
		deletebtn =new JButton("DELETE");
	
		mainframe.add(insertbtn);
		mainframe.add(viewbtn);
		mainframe.add(updatebtn);
		mainframe.add(deletebtn);
		mainframe.setSize(500,500);
		mainframe.setLayout(new FlowLayout());
		mainframe.setVisible(true);
		
		insertbtn.addActionListener(this);
		viewbtn.addActionListener(this);
		updatebtn.addActionListener(this);
		deletebtn.addActionListener(this);
		
	}
	
	public static void main(String[] args)
	{
		new MainClass();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Operations o1 =new Operations();
		
		if(e.getSource()==insertbtn)
		{
			o1.insertdata();
		}
		if(e.getSource()==viewbtn)
		{
			o1.viewdata();
		}
		if(e.getSource()==updatebtn)
		{
			o1.updatedata();
		}
		if(e.getSource()==deletebtn)
		{
			o1.deletedata();
		}
		
	}
}
