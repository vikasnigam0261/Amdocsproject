package com.amdocs.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection{
	 
	 private static final String URL = "jdbc:mysql://localhost:3306/amdocs";
	 private static final String USERNAME="root";
	 private static final String PASSWORD="vikas";
	 private static Connection connection;
	 private static boolean status =false;
	 
	 
	 public static Connection createConnection() {
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			 status = true;
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
		 return connection;
	 }
	 public void connectStatus() {
		 if(status == false) {
			 System.out.println("NO CONNECTION");
			 return;
		 }
		 System.out.println("CONNECTED");
		 }
	 }

	 
 