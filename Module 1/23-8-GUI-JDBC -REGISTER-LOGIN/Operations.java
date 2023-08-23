import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

public class Operations 
{
	JFrame Lgin, Sup;
	JTextField Uname, Fname, Email;
	JPasswordField Pass;
	JLabel Un, Fn, Em, Ps, Er;
	JButton Log, Sig;
	String host="jdbc:mysql://localhost:3306/";
	String dbname="croma";
	String url=host+dbname;
	public void register()
	{
		Sup = new JFrame("Sign up here!");
		Sup.setSize(450, 300);
		Sup.setLayout(null);
		
		Un = new JLabel("Userame");
		Un.setBounds(44, 25, 70, 17);
		
		Ps = new JLabel("Password");
		Ps.setBounds(44, 67, 70, 17);
		
		Fn = new JLabel("Full Name");
		Fn.setBounds(44, 107, 70, 17);
		
		Em = new JLabel("Email Id");
		Em.setBounds(44, 145, 70, 17);
		
		Uname = new JTextField();
		Uname.setBounds(115, 22, 195, 20);
		
		Pass = new JPasswordField();
		Pass.setBounds(115, 64, 195, 20);
		
		Fname = new JTextField();
		Fname.setBounds(115, 104, 195, 20);
		
		Email = new JTextField();
		Email.setBounds(115, 142, 195, 20);
		
		Sig = new JButton("Sign Up");
		Sig.setBounds(115, 188, 89, 23);
		
		Sig.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				
				
				String un,ps,fn,em;
				
				un = Uname.getText();
				ps = Pass.getText();
				fn = Fname.getText();
				em = Email.getText();
			
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					
					
					String sql ="insert into signup values(null,'"+un+"','"+fn+"','"+em+"','"+ps+"')";
					Statement stmt = con.createStatement();
					
					int data = stmt.executeUpdate(sql);
					
					if(data>0)
					{
						System.out.println("Inserted");
						Sup.setVisible(false);
					}
					else
					{
						System.out.println("Username or Email Id already present. Please enter a new one");
					}
					
					
					
				} 
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
				
				
			}
		});
		
		Sup.add(Em);
		Sup.add(Email);
		Sup.add(Ps);
		Sup.add(Fn);
		Sup.add(Fname);
		Sup.add(Un);
		Sup.add(Uname);
		Sup.add(Pass);
		Sup.add(Sig);
		Sup.setVisible(true);
		
		
		
		
		
	}
	
	public void login()
	{
		
		Lgin = new JFrame("Login here!");
		Lgin.setSize(450, 300);
		Lgin.setLayout(null);
		
		Em = new JLabel("Email");
		Em.setBounds(44, 25, 70, 17);
		
		Ps = new JLabel("Password");
		Ps.setBounds(44, 67, 70, 17);
		
		Email = new JTextField();
		Email.setBounds(115, 22, 195, 20);
		
		Pass = new JPasswordField();
		Pass.setBounds(115, 64, 195, 20);
		
		Log = new JButton("Log In");
		Log.setBounds(115, 188, 89, 23);
		
		Log.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				String iem, ips;
				String em = Email.getText();
				String ps = Pass.getText();
				
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=	(Connection)DriverManager.getConnection(url,"root","");
					
					String sql ="select email,password from signup where email ='"+em+"'";
					Statement stmt = (Statement) con.createStatement();
					ResultSet set = stmt.executeQuery(sql);
					
					if(set.next())
					{
						iem = set.getString(1);
						ips = set.getString(2);
						
						
						if(ips.equals(ps))
						{
							JOptionPane.showMessageDialog(Log, "Login Successfull");
							Lgin.setVisible(false);
						}
						else
						{
							JOptionPane.showMessageDialog(Log, "Wrong Passowrd!!\nLogin unsuccessfull");
						}
					}
					else
					{
						JOptionPane.showMessageDialog(Log,"No user found, username invalid");
					}
					
					
					
				} 
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
				
			}
		});
		
		Lgin.add(Em);
		Lgin.add(Email);
		Lgin.add(Ps);
		Lgin.add(Pass);
		Lgin.add(Log);
		Lgin.setVisible(true);
		
	}
	
}
