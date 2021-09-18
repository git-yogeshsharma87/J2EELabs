package org.simplilearn.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	private Connection connection;
	
	public DbConnection() throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		

		String dbURL="jdbc:mysql://localhost:3306/users";
		String dbUser= "root";
		String dbPassword= "Jsr@30071987";
		
		this.connection = DriverManager.getConnection(dbURL,dbUser,dbPassword);		
		
	}
	
	
	public void closeConnection() throws Exception {
		if(this.connection!=null) {
			this.connection.close();
		}		
	}
	
	public Connection getConnection() {
		return connection;
	}
	
	

}
