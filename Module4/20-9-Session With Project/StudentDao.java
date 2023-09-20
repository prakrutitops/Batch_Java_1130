package com.dao;
/*
Dao is responsible for database opration like insert ,update ,
delete,select.
*/
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Student;
import com.util.StudentUtil;

public class StudentDao {

	public static void insertStudent(Student s)
	{
		try {
			Connection conn=StudentUtil.createConnection();
			String sql="insert into signup(firstname,email,phone,password) values(?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, s.getFirstname());
			pst.setString(2, s.getEmail());
			pst.setString(3, s.getPhone());
			pst.setString(4, s.getPassword());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Student checkLogin(Student s)
	{
		Student student=null;
		try {
			Connection conn=StudentUtil.createConnection();
			String sql="select * from signup where email=? and password=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, s.getEmail());
			pst.setString(2, s.getPassword());
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				student=new Student();
				student.setId(rs.getInt("id"));
				student.setFirstname(rs.getString("firstname"));
				student.setEmail(rs.getString("email"));
				student.setPhone(rs.getString("phone"));
				student.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}
	
}
