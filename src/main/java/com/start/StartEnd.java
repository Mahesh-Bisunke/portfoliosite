package com.start;

import com.dao.TableCreation;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class StartEnd implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {

		TableCreation.adminTable();
		TableCreation.projectTable();
		TableCreation.EducationTable();
		TableCreation.ContactTable();
	}

}
