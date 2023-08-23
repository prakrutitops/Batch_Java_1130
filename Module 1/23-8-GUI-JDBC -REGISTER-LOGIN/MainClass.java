import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainClass implements ActionListener 
{
	JFrame fm;
	JButton Reg, Lin;
	JLabel wel;
	
	public MainClass() 
	{
		
		fm = new JFrame();
		fm.setSize(450, 300);
		
		Reg = new JButton("Sign Up");
		Reg.setBounds(144, 55, 101, 38);
		Reg.addActionListener(this);
		
		Lin = new JButton("Login");
		Lin.setBounds(144, 125, 101, 38);
		Lin.addActionListener(this);
		
		wel = new JLabel("WELCOME");
		wel.setBounds(166, 11, 61, 38);
		
		fm.add(Reg);
		fm.add(Lin);
		fm.add(wel);
		fm.setLayout(null);
		fm.setVisible(true);
		
		
	}
	
	public static void main(String[] args) 
	{
		new MainClass();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		Operations o1 =new Operations();
		if(e.getSource()==Reg)
		{
			o1.register();
		}
		
		if(e.getSource()==Lin)
		{
			o1.login();
		}
		
	}
	
}
