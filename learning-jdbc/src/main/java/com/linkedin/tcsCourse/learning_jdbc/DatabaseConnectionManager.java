package com.linkedin.tcsCourse.learning_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnectionManager {
	private final String url1;
	private final Properties prop;
	public DatabaseConnectionManager(String host, String databaseName, String userName, String password) {
		super();
		this.url1 = "jdbc:mysql://"+host+"/"+databaseName;
				//localhost:3306/minor_project1?createDatabaseIfNotExist=true";
		this.prop = new Properties();
		this.prop.setProperty("user", userName);
		this.prop.setProperty("password",password);
	}
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(this.url1, this.prop);
	}
	

}
