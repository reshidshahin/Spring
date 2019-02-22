package com.project.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.db.DBConnection;

public class TestSpring {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
		
		
		DBConnection dbConnection = (DBConnection) applicationContext.getBean("dbConnection");
		dbConnection.openConnection();
		dbConnection.closeConnection();
		applicationContext.close();
	}
}
