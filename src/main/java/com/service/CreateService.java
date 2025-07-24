package com.service;

import com.dto.ContactDTO;
import com.dto.EducationDTO;

import jakarta.servlet.http.Part;

public interface CreateService {

	public String insertContactDTOservice(ContactDTO contactdto);

	public String validateProjectFile(String filename, String contentType, long size);

	public String insertProjectFile(Part part, String realPath);

	public String insertResumeFile(Part part, String realPath);

	public String insertAddEducationservice(EducationDTO educationdto);

}
