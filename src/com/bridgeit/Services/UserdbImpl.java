package com.bridgeit.Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bridgeit.Model.User;

public class UserdbImpl implements UserDb {
	
		
	public int insertuser(User u) {

		int status = 0;
		try {
			Connection con = MyConnectionProvider.getCon();
			PreparedStatement ps = con.prepareStatement("insert into login values(?,?,?,?,?,?)");
			ps.setString(1, u.getFirstname());
			ps.setString(2, u.getLastname());
			ps.setString(3, u.getUsername());
			ps.setString(4, u.getEmail());
			ps.setString(5, u.getContactnumber());
			ps.setString(6, u.getPassword());
			status = ps.executeUpdate();
			con.close();

		} catch (Exception e) {
			System.out.println(e);

		}
		return status;

	}

	public User getuser(String username, String password) {
		User u = new User();
		try {
			Connection con = MyConnectionProvider.getCon();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM login where username=? and password=? ");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				u.setFirstname(rs.getString(1));
				u.setLastname(rs.getString(2));
				u.setUsername(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setContactnumber(rs.getString(5));
				u.setPassword(rs.getString(6));

			}

		} catch (Exception e) {
			System.out.println(e);

		}

		return u;

	}

	

	

}
