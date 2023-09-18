package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.SignupModel;


public class UserDao 
{
	
	
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopsite","root","");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	public static int signupmethod(SignupModel m)
	{
		int status =0;
		Connection con = UserDao.getconnect();
		
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into signup (firstname,email,phone,password) values (?,?,?,?)");
			ps.setString(1,m.getFirstname());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getPhone());
			ps.setString(4,m.getPassword());
			
			status = ps.executeUpdate();
		
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		
		
	}
	
	public static SignupModel loginmethod(SignupModel model) 
	{
		boolean flag = false;

		SignupModel obj = null;

		try {
			Connection con = UserDao.getconnect();
			PreparedStatement ps = con.prepareStatement("select * from signup where email=? and password=?");
			ps.setString(1, model.getEmail());
			ps.setString(2, model.getPassword());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) 
			{
				obj = new SignupModel();
				obj.setId(rs.getInt("id"));
				obj.setFirstname(rs.getString("firstname"));
				obj.setEmail(rs.getString("email"));
				obj.setPhone(rs.getString("phone"));
				obj.setPassword(rs.getString("password"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return obj;
	}
	
	
	
}
