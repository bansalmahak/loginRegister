package com.bridgeit.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgeit.Model.User;
import com.bridgeit.Services.UserDb;
import com.bridgeit.Services.UserdbImpl;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserDb obj = new UserdbImpl();

		String uname = request.getParameter("username");
		String pass = request.getParameter("password");

		User u = obj.getuser(uname, pass);

		if (u!=  null) {
			request.setAttribute("username", uname);
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		} else {
			request.setAttribute("message", "User not found,Kindly enter valid user credentials");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}

	}

}
