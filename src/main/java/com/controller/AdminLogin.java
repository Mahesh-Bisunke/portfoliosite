package com.controller;

import java.io.IOException;

import com.service.ReadService;
import com.service.ReadServiceimpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		ReadService readServiceimpl = new ReadServiceimpl();
		String result = readServiceimpl.checkAdminLoginCredentialStringService(username, password);

		if ("EXISTS".equalsIgnoreCase(result)) {
			session.setAttribute("adminlogin", username);
			response.sendRedirect("admin.jsp");
		} else {
			session.setAttribute("msg", result);
			response.sendRedirect(":adminlogin.jsp");

		}

	}

}
