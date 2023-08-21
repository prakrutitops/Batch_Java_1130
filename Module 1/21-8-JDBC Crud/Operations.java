package com.pages;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Operations 
{
	JFrame insertframe,deleteframe,updateframe;
	JTextField tf1,tf2,tf3;
	JButton insertbtn,deletebtn,editbtn,updatebtn;
	JPanel jp,jp2;
	int did;
	
	public void insertdata()
	{
		insertframe =new JFrame();
		
		tf1 =new JTextField(15);
		tf2 =new JTextField(15);
		insertbtn =new JButton("INSERT");
		
		
		insertbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				String host="jdbc:mysql://localhost:3306/";
				String db="croma";
				String url = host+db;
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					
					
					String name = tf1.getText().toString();
					String price = tf2.getText().toString();
					
					
					String sql ="insert into product values(null,'"+name+"','"+price+"')";
					
					
					Statement stmt = con.createStatement();
					
					int data = stmt.executeUpdate(sql);
					
					if(data>0)
					{
						insertframe.setVisible(false);
						System.out.println("Inserted");
					}
					else
					{
						System.out.println("Insertion Fail");
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
		insertframe.add(insertbtn);
		insertframe.setSize(500,500);
		insertframe.setLayout(new FlowLayout());
		insertframe.setVisible(true);
	}
	public void viewdata()
	{
		
		String host="jdbc:mysql://localhost:3306/";
		String db="croma";
		String url = host+db;
		
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","");
			
			String sql ="select * from product";
			
			Statement stmt = con.createStatement();
			ResultSet set =stmt.executeQuery(sql);
			
			System.out.println("ID"+" "+"NAME"+" "+"PRICE");
			while(set.next())
			{
				
				int id = set.getInt(1);
				String name = set.getString(2);
				String price = set.getString(3);
				
				
				System.out.println(id+" "+name+" "+price);
				
			}
		
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void updatedata()
	{
		
		updateframe =new JFrame();
		tf3 =new JTextField(15);
		editbtn =new JButton("EDIT");
		tf1 =new JTextField(15);
		tf2 =new JTextField(15);
		updatebtn=new JButton("UPDATE");
		
		
		jp =new JPanel();
		jp2 =new JPanel();
		
		jp.add(tf3);
		jp.add(editbtn);
		
		jp2.add(tf1);
		jp2.add(tf2);
		jp2.add(updatebtn);
		
		jp.setVisible(true);
		jp2.setVisible(false);
		
		editbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				
				
				
				
				
				
				String host="jdbc:mysql://localhost:3306/";
				String db="croma";
				String url = host+db;
				
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					
					
					did=Integer.parseInt(tf3.getText().toString());
					String sql ="select * from product where id='"+did+"'";
					
					
					Statement stmt = con.createStatement();
					ResultSet set =stmt.executeQuery(sql);
					
					
					if(set.next())
					{
						
						int id = set.getInt(1);
						String name = set.getString(2);
						String price = set.getString(3);
						
						jp2.setVisible(true);
						jp.setVisible(false);
						
						
						tf1.setText(name);
						tf2.setText(price);
						
						updatebtn.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								
								
								String host="jdbc:mysql://localhost:3306/";
								String db="croma";
								String url = host+db;
								
								try 
								{
									Class.forName("com.mysql.jdbc.Driver");
									Connection con = DriverManager.getConnection(url,"root","");
									
									
									String name = tf1.getText().toString();
									String price = tf2.getText().toString();
									
									
									String sql ="update product set name='"+name+"',price='"+price+"' where id ='"+did+"'";
									
									
									Statement stmt = con.createStatement();
									
									int data = stmt.executeUpdate(sql);
									
									if(data>0)
									{
										updateframe.setVisible(false);
										System.out.println("Updated");
									}
									else
									{
										System.out.println("Updation Fail");
									}
									
								
								}
								catch (Exception e1)
								{
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
								
									
								
								
								
								
								
								
								
							}
						});
						
						
						
						
						
						
					}
				
				}
				catch (Exception e3) 
				{
					// TODO Auto-generated catch block
					e3.printStackTrace();
				}
				
				
				
			
				
				
				
				
			}
		});
		
		
		
		
		updateframe.add(jp);
		updateframe.add(jp2);
		updateframe.setSize(500,500);
		updateframe.setLayout(new FlowLayout());
		updateframe.setVisible(true);
		
		
		
	}
	public void deletedata()
	{
		
		deleteframe =new JFrame();
		
		tf3 =new JTextField(15);
		
		deletebtn =new JButton("DELETE");
		
		
		deleteframe.add(tf3);
		deleteframe.add(deletebtn);
		deleteframe.setSize(500,500);
		deleteframe.setLayout(new FlowLayout());
		deleteframe.setVisible(true);
		
		deletebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				
				String host="jdbc:mysql://localhost:3306/";
				String db="croma";
				String url = host+db;
				
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					
					String id = tf3.getText().toString();
					
					String sql ="delete from product where id='"+id+"'";
					
					Statement stmt = con.createStatement();
					int data =stmt.executeUpdate(sql);
					
					if(data>0)
					{
						deleteframe.setVisible(false);
					}
					else
					{
						System.out.println("Error");
					}
				
				}
				catch (Exception e2) 
				{
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
			}
		});
		
		
	
		
	}
}
