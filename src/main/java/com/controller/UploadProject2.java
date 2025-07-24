package com.controller;

import java.io.IOException;

import com.service.CreateService;
import com.service.CreateServiceimpl;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;

@WebServlet("/UploadProject2")
@MultipartConfig
public class UploadProject2 extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletContext servletContext = getServletContext();
		String realPath = servletContext.getRealPath("myproject");

		Part part = request.getPart("myfile");

		HttpSession session = request.getSession();

		CreateService createServiceimpl = new CreateServiceimpl();
		String result = createServiceimpl.insertProjectFile(part, realPath);

		session.setAttribute("msg", result);

		response.sendRedirect("uploadProject.jsp");

	}

}
