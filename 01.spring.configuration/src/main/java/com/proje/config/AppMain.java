package com.proje.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proje.db.DBConnection;

@Configuration
public class AppMain {
	
	@Bean
	public DBConnection dbConnection() {
		
		DBConnection dbConnection= new DBConnection();
		return dbConnection;
	}
}
