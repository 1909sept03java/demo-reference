package com.revature.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(
				"jdbc:oracle:thin:@demo-sept3.chid1me7fqpz.us-east-1.rds.amazonaws.com:1521:orcl", "admin", "p4ssw0rd");
	}

	public static Connection getConnectionFromFile(String filename) throws SQLException, IOException {
		// read in contents of a properties file - NEVER want to hardcode credentials
		Properties prop = new Properties();
		InputStream in = new FileInputStream(filename);
		prop.load(in);
		// need to provide: url to the database, username, password
		return DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
				prop.getProperty("password"));
	}

}
