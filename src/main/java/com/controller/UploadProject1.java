package com.controller;


import java.io.IOException;

import com.service.CreateService;
import com.service.CreateServiceimpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;

@WebServlet("/UploadProject1")
@MultipartConfig
public class UploadProject1 extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		Part part = request.getPart("myfile");

		String filename = part.getSubmittedFileName();

		String contentType = part.getContentType();

		long size = part.getSize();

		CreateService createServiceimpl = new CreateServiceimpl();
		String result = createServiceimpl.validateProjectFile(filename, contentType, size);

		if (result.equalsIgnoreCase("VALID")) {
			// NEXT SERVLET
			// response.sendRedirect("https://chatgpt.com/ ");--->New Request will be
			// created we are doing servlet collaboration here

			RequestDispatcher requestDispatcher = request.getRequestDispatcher("UploadProject2");
			requestDispatcher.forward(request, response);

		} else {

			session.setAttribute("msg", result);
			response.sendRedirect("uploadProject.jsp");

		}

	}

}
