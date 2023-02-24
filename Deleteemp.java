package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Deleteemp {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/infosyshiring", "root", "root");
		Statement statement = connection.createStatement();
		statement.execute("delete from  infosys where age=60");
			connection.close();
			System.out.println("data deleted");
			} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
}
}
