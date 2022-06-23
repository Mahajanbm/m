package com.demo.jdbc.demo;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Impact","root","1234");
Statement statement=con.createStatement();
boolean resultSet=statement.execute("insert into Demo  values(1,'mahi','Hyd','CSC')");
System.out.print("Record Inserted ");

	}
}
