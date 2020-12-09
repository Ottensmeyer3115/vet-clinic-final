package com.cognixia.jump.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// create resources folder in src/main
// right click on project Build Path -> Configure Build Path -> Source -> Add Folder
// then make sure resources folder is checked then hit Apply and Close
// now create the config.properties file with all the database connection info
public class ConnectionManager {

	private static Connection connection = null;

	private static final String URL = "jdbc:mysql://den1.mysql4.gear.host?serverTimezone=UTC";
	private static final String USERNAME = "finalprojectgrp2";
	private static final String PASSWORD = "Root@123";

	private static void makeConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Connection getConnection() {

		if (connection == null) {
			makeConnection();
		}

		return connection;
	}

}
