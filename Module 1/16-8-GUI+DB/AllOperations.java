package com.a168;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class AllOperations 
{
	JFrame insertframe;
	JTextField tf1,tf2;
	JButton btn1;
	
	
	public void insertdata()
	{
		insertframe =new JFrame();
		
		tf1 =new JTextField(15);
		
		tf2 =new JTextField(15);
		
		btn1 =new JButton("INSERT");
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				String host="jdbc:mysql://localhost:3306/";
				String db="details";
				String url =host+db;
				
				String name = tf1.getText().toString();
				String surname = tf2.getText().toString();
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					String sql ="insert into info values (null,'"+name+"','"+surname+"')";
					Statement stmt = con.createStatement();
					int data = stmt.executeUpdate(sql);
					
					if(data>0)
					{
						insertframe.setVisible(false);
					}
					else
					{
						System.out.println("Error");
					}
				}
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
			}
		});
		
		insertframe.add(tf1);
		insertframe.add(tf2);
		insertframe.add(btn1);
		insertframe.setSize(400,400);
		insertframe.setLayout(new FlowLayout());
		insertframe.setVisible(true);
		
	}
}
