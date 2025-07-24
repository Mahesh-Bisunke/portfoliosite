package com.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DownloadResume")
public class DownloadResume extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// file inpute stream --> get the real path file
		// byte array actual file taken out
		// browser then write the file (response) to make it available to download

		String realPath = getServletContext().getRealPath("myresume");

		FileInputStream fis = new FileInputStream(realPath + File.separator + "Mahesh_Bisunke_Resume.pdf");
		byte[] b = fis.readAllBytes();

		ServletOutputStream out = response.getOutputStream();

		response.setHeader("content-disposition", "filename=Mahesh_Bisunke_Resume.pdf");

		response.setContentType("application/octet-stream");

		out.write(b);
	}

}
