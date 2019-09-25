package com.revature.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionService {

	public static Connection getConnection() throws SQLException, IOException {
		// read in contents of a properties file - NEVER want to hardcode credentials
		Properties prop = new Properties();
		//InputStream in = new FileInputStream("connection.properties");
		prop.load(ConnectionService.class.getClassLoader().getResourceAsStream("connection.properties"));
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// need to provide: url to the database, username, password
		return DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
				prop.getProperty("password"));
	}

}
