package com.bridgeit.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgeit.Model.User;
import com.bridgeit.Services.UserdbImpl;

public class Adduser extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		
		String username=request.getParameter("email");
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String pass=request.getParameter("password");
		String contactNo=request.getParameter("contact");
	
	
		
	User user=new User();
	UserdbImpl impl=new UserdbImpl();
	user.setFirstname(firstname);
	user.setLastname(lastname);
	user.setUsername(username);
	user.setPassword(pass);
	user.setEmail(username);
	user.setContactnumber(contactNo);
		//user.setFirstname(request.getParameter("firstname"));
		int status=impl.insertuser(user);
		
		if(status>0) {
			response.sendRedirect("login.jsp");
			
		}
		
	}
}
