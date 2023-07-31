package com.a317;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameEx 
{
	
	JFrame frame;
	JLabel lfirstname,llastname,lemail,lpass,lconfirmpass;
	JTextField tffirstname,tflastname,tfemail,tfpass,tfcpass;
	JButton btnsave;
	
	public FrameEx() 
	{
		frame =new JFrame("Student Registration Form");
		
		
		lfirstname =new JLabel("Firstname: ");
		lfirstname.setBounds(27, 35, 100, 14);
		
		llastname =new JLabel("Lastname: ");
		llastname.setBounds(27, 70, 100, 14);
		
		lemail =new JLabel("Email: ");
		lemail.setBounds(27, 105, 100, 14);
		
		
		lpass =new JLabel("Password: ");
		lpass.setBounds(27, 140, 100, 14);
		
		
		lconfirmpass =new JLabel("Confirm Password: ");
		lconfirmpass.setBounds(27, 175, 120, 14);
		
		tffirstname =new JTextField();
		tffirstname.setBounds(141, 35, 186, 20);
		
		tflastname =new JTextField();
		tflastname.setBounds(141, 68, 186, 20);
		
		tfemail =new JTextField();
		tfemail.setBounds(141, 101, 186, 20);
		
		tfpass =new JTextField();
		tfpass.setBounds(141, 134, 186, 20);
		
		tfcpass =new JTextField();
		tfcpass.setBounds(141, 170, 186, 20);
		
		btnsave =new JButton("SAVE");
		btnsave.setBounds(83, 230, 89, 23);
		
		btnsave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				String fname = tffirstname.getText().toString();
				String lname = tflastname.getText().toString();
				String email= tfemail.getText().toString();
				String pass = tfpass.getText().toString();
				String cpass = tfcpass.getText().toString();
				
				System.out.println(fname);
				System.out.println(lname);
				System.out.println(email);
				System.out.println(pass);
				System.out.println(cpass);
				
				
			}
		});
		
		
		frame.add(lfirstname);
		frame.add(llastname);
		frame.add(lemail);
		frame.add(lpass);
		frame.add(lconfirmpass);
		frame.add(tffirstname);
		frame.add(tflastname);
		frame.add(tfemail);
		frame.add(tfpass);
		frame.add(tfcpass);
		frame.add(btnsave);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) 
	{
		new FrameEx();
	}
}
