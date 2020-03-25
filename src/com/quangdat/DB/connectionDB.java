package com.quangdat.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionDB {
	String url = "jdbc:sqlserver://DESKTOP-6154Q51\\SQLEXPRESS;databaseName=phongtro";
	String user = "sa";
	String password = "sa";
	public Connection getConnection() {
	
		Connection conn = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url,user,password);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return conn;
	}
	
	
}


