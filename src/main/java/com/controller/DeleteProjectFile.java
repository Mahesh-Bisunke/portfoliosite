package com.controller;

import java.io.IOException;

import com.service.DeleteService;
import com.service.DeleteServiceImpl;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/DeleteProjectFile")
public class DeleteProjectFile extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

		ServletContext servletContext = getServletContext();
		String realPath = servletContext.getRealPath("myproject");

		HttpSession session = request.getSession();
		String filename = request.getParameter("filename");

		DeleteService deleteServiceImpl = new DeleteServiceImpl();
		String result = deleteServiceImpl.projectFileDeleteService(filename, realPath);

		session.setAttribute("msg", result);

		response.sendRedirect("readAllProject.jsp");

	}

}
