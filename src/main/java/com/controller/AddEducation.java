package com.controller;

import java.io.IOException;

import com.dto.EducationDTO;
import com.service.CreateServiceimpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/AddEducation")
public class AddEducation extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String year = request.getParameter("year");
		String title = request.getParameter("title");
		String subtitle = request.getParameter("subtitle");
		String description = request.getParameter("description");

		EducationDTO educationDTO = new EducationDTO(year, title, subtitle, description);
		String result = new CreateServiceimpl().insertAddEducationservice(educationDTO);

		HttpSession session = request.getSession();
		session.setAttribute("msg", result);

		response.sendRedirect("addEducation.jsp");

	}

}
