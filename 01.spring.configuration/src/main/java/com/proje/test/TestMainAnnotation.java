package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.proje.config.AppMain;
import com.proje.db.DBConnection;

public class TestMainAnnotation {
	
	
	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext = new AnnotationConfigApplicationContext(
				AppMain.class);
		DBConnection dbConnection = configurableApplicationContext.getBean(DBConnection.class);
		dbConnection.openConnection();
		dbConnection.closeConnection();

		configurableApplicationContext.close();

		
	}
}
