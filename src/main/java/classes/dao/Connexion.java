package classes.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {

	public Connection conn;



	{
	String url = "jdbc:mysql://localhost:3306/";
	String dbName;
	dbName = "banque"; // nom de la base
	String driver = "com.mysql.cj.jdbc.Driver"; // "com.mysql.jdbc.Driver";
	String userName = "admin";
	String password = "formation";
	try {
	Class.forName(driver).newInstance();



	conn = DriverManager.getConnection(url + dbName, userName, password);
	System.out.println("la connexion a reussie");
	} catch (Exception e) {
	System.out.println(e.getMessage());
	}
	}
	}
