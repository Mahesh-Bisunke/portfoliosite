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
@WebServlet("/UploadResume")
@MultipartConfig
public class UploadResume extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		ServletContext servletContext = getServletContext();
		String realPath = servletContext.getRealPath("myresume");

		Part part = request.getPart("myresume");

		CreateService createServiceimpl = new CreateServiceimpl();
		String result = createServiceimpl.insertResumeFile(part, realPath);

		session.setAttribute("msg", result);

		response.sendRedirect("uploadResume.jsp");

	}

}
