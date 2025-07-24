package com.controller;

import java.io.IOException;

import com.dto.ContactDTO;
import com.service.CreateService;
import com.service.CreateServiceimpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Contact")
public class Contact extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String message = request.getParameter("message");

		ContactDTO contactDTO = new ContactDTO(name, email, message);

		CreateService createService = new CreateServiceimpl();
		String result = createService.insertContactDTOservice(contactDTO);

		System.out.println(result);

		HttpSession session = request.getSession();
		session.setAttribute("msg", result);

		response.sendRedirect("index.jsp");

	}

}
