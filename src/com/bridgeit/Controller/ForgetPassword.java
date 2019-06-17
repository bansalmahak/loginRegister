package com.bridgeit.Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgeit.Services.Userforget;

@WebServlet("/forget")
public class ForgetPassword extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Userforget userfogot = new Userforget();
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (!username.isEmpty()) {
			boolean username1 = true;
			System.out.println("username");
			if (username1 == (Userforget.uservalidate(username))) {
				System.out.println("uservaditae");
				try {
					Userforget.insertUser(password, username);
				} catch (SQLException e) {

					e.printStackTrace();
				}
				RequestDispatcher req = request.getRequestDispatcher("forgot.jsp");
				req.forward(request, response);
			} else {

				RequestDispatcher req = request.getRequestDispatcher("welcome.jsp");
				req.forward(request, response);
			}
		} else {
			RequestDispatcher req = request.getRequestDispatcher("login.jsp");
			req.forward(request, response);
		}

	}
}
