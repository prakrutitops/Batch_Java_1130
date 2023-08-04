package com.a48;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class NotepadMenuEx extends WindowAdapter implements ActionListener
{
	JFrame frame;
	JMenuBar menuBar;
	JMenu File,Edit,Help;
	JMenuItem cut,copy,paste,selectall;
	JTextArea ta;
	
	public NotepadMenuEx() 
	{
		frame =new JFrame();
		
		menuBar =new JMenuBar();
		
		File =new JMenu("File");
		Edit =new JMenu("Edit");
		Help =new JMenu("Help");
		
		cut =new JMenuItem("cut");
		copy =new JMenuItem("copy");
		paste =new JMenuItem("paste");
		selectall =new JMenuItem("select all");
		
		ta=new JTextArea();
		ta.setBounds(100, 100, 100, 100);
		
		Edit.add(cut);
		Edit.add(copy);
		Edit.add(paste);
		Edit.add(selectall);
		
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		selectall.addActionListener(this);
		
		menuBar.add(File);
		menuBar.add(Edit);
		menuBar.add(Help);
		frame.addWindowListener(this);
		frame.add(ta);
		frame.setJMenuBar(menuBar);
		frame.setSize(500,500);
		frame.setVisible(true);
		
	}
	public static void main(String[] args)
	{
		new NotepadMenuEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==cut)
		{
			ta.cut();
		}
		if(e.getSource()==copy)
		{
			ta.copy();
		}
		if(e.getSource()==paste)
		{
			ta.paste();
		}
		if(e.getSource()==selectall)
		{
			ta.selectAll();
		}
		
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
