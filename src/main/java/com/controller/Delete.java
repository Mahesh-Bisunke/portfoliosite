package com.controller;

import java.io.IOException;

import com.service.DeleteService;
import com.service.DeleteServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Delete")
public class Delete extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		DeleteService deleteServiceImpl = new DeleteServiceImpl();
		String result = deleteServiceImpl.contactDeleteService(id);

		HttpSession session = request.getSession();
		session.setAttribute("msg", result);

		response.sendRedirect("readContact.jsp");

	}

}
