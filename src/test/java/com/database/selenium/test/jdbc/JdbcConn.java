package com.database.selenium.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConn {
	public Connection conn = null;
	public String url = "jdbc:postgresql://localhost:5432/";
	public String dataBaseNome = "iLAB";
	public String username = "postgres";
	public String password = "admin";
	
	public ResultSet result;

	//BaseTest baseTest = new BaseTest();



	public void configuracao() {
	
	try {
	Class.forName("org.postgresql.Driver");
	conn = DriverManager.getConnection(url + dataBaseNome, username, password);
	
	String sqlQuery = "SELECT * FROM produtos ORDER BY Nome DESC LIMIT 1;";
	Statement statement = conn.createStatement();
	result = statement.executeQuery(sqlQuery);
	
	result.next();
	
	System.out.println(result.getString("nome"));
	System.out.println(result.getString("categoria"));
	System.out.println(result.getString("preco"));
	
	} catch(Exception e) {
		System.out.println(e);
	}
	
	}

}
