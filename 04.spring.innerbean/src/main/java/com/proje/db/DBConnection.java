package com.proje.db;

public class DBConnection {

	private Database database;

	public void openConnection() {

		System.out.println("URL: " + this.database.getUrl());
		System.out.println("Username: " + this.database.getUsername());
		System.out.println("Password: " + this.database.getPassword());

		System.out.println("Baglanti acildi.");

	}

	public void closeConnection() {
		System.out.println("Baglanti kapatildi.");
	}

	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}

}
