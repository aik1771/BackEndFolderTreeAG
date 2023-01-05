package recipes.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import recepies.exception.DbException;

import java.sql.Connection;

public class DBConnection {
	private static final String SCHEMA = "recepies";
	private static final String USER = "recipes";
	private static final String PASSWORD = "recipes";
	private static final String HOST = "localhost";
	private static final int PORT = 3306;

	public static Connection getConnection() {
		String url = 
				String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false", HOST, PORT, SCHEMA, USER, PASSWORD);
	
		System.out.println("Try to make the database connection to URL -> "+url);
		
		try {
			Connection conn = DriverManager.getConnection(url);
			System.out.println("Success at connection");
			return conn;
		} catch (SQLException e) {
			throw new DbException(e);
			// TODO Auto-generated catch block
			
		}
	}

}
