package com.a28;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MenuEx 
{
	JFrame menuframe;
	JLabel lblmenu;
	JCheckBox chk1,chk2,chk3;
	JButton btnorder;
	
	
	public MenuEx() 
	{
		// TODO Auto-generated constructor stub
	
		menuframe =new JFrame();
		
		lblmenu =new JLabel("MENU");
		lblmenu.setBounds(215, 11, 46, 14);
		
		
		chk1 =new JCheckBox("Pizza @ Rs. 100");
		chk1.setBounds(159, 40, 197, 23);
		
		chk2 =new JCheckBox("Burger @ Rs. 70");
		chk2.setBounds(159, 90, 197, 23);
		
		chk3 =new JCheckBox("Coffee @ Rs. 120");
		chk3.setBounds(159, 140, 197, 23);
		
		btnorder =new JButton("Order");
		btnorder.setBounds(159, 200, 89, 23);
		
		btnorder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				StringBuffer buffer =new StringBuffer("\n Selected Items: ");
				int amount = 0;
				
				if(chk1.isSelected())
				{
					buffer.append("\n Pizza @ Rs. 100");
					amount+=100;
				}
				
				if(chk2.isSelected())
				{
					buffer.append("\n Burger @ Rs. 70");
					amount+=70;
				}
				
				if(chk3.isSelected())
				{
					buffer.append("\n Coffee @ Rs. 120");
					amount+=120;
				}
				
				buffer.append("\n Total :"+amount);
				JOptionPane.showMessageDialog(menuframe, buffer.toString());
				
				
			}
		});
		
		menuframe.add(lblmenu);
		menuframe.add(chk1);
		menuframe.add(chk2);
		menuframe.add(chk3);
		menuframe.add(btnorder);
		menuframe.setSize(500,500);
		menuframe.setLayout(null);
		menuframe.setVisible(true);
	}
	public static void main(String[] args) {
		
		
		new MenuEx();
	}
}
