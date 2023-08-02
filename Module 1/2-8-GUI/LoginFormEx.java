package com.a28;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFormEx 
{
	JFrame loginform;
	JLabel l1,l2;
	JTextField tf1;
	JPasswordField tf2;
	JButton btnlogin;
	
	public LoginFormEx() 
	{
		// TODO Auto-generated constructor stub
		loginform =new JFrame();
		
		l1 =new JLabel("Enter Your Email: ");
		l1.setBounds(30, 30, 186, 20);
		
		l2 =new JLabel("Enter Your Password:");
		l2.setBounds(30, 70, 186, 20);
		
		tf1 =new JTextField();
		tf1.setBounds(170, 30, 186, 20);
		
		tf2 =new JPasswordField();
		tf2.setBounds(170, 70, 186, 20);
		
		btnlogin =new JButton("Login");
		btnlogin.setBounds(140, 125, 86, 20);
		btnlogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				String email = tf1.getText().toString();
				String pass = tf2.getText().toString();
				
				if(email.equals("admin@gmail.com") && pass.equals("1234"))
				{
					new MenuEx();
				}
				else
				{
					JOptionPane.showMessageDialog(loginform, "Logged in Fail !! ,Please Enter Your Proper Details");
				}
				
			}
		});
		
		loginform.add(l1);
		loginform.add(l2);
		loginform.add(tf1);
		loginform.add(tf2);
		loginform.add(btnlogin);
		loginform.setSize(500,500);
		loginform.setLayout(null);
		loginform.setVisible(true);
	}
	public static void main(String[] args)
	{
		new LoginFormEx();
	}
}
