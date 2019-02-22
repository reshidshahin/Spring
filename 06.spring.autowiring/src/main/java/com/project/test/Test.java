package com.project.test;

import com.project.db.DBConnection;
import com.project.db.Database;

public class Test {
	public static void main(String[] args) {

		Database database = new Database("mysql:localhost", "root", "1231234");
		DBConnection dbConnection = new DBConnection();
		dbConnection.setDatabase(database);
		dbConnection.openConnection();
		dbConnection.closeConnection();
	
	}

}
