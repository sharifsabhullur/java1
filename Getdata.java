package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Getdata {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/infosyshiring", "root", "root");
		Statement statement = connection.createStatement();
	ResultSet resultset=statement.executeQuery("select * from infosys");
	    while(resultset.next())
	    {
	    	System.out.println("employee name is:"+resultset.getInt(1));
	    	System.out.println("employee name is:"+resultset.getString(2));
	    	System.out.println("employee name is:"+resultset.getInt(3));
	    	System.out.println("employee name is:"+resultset.getString(4));
	    	System.out.println("employee name is:"+resultset.getLong(5));
	    	System.out.println("employee name is:"+resultset.getString(6));
	    	System.out.println("employee name is:"+resultset.getDouble(7));
	    	System.out.println("=============================");
	    }
			connection.close();
			System.out.println("data getted");
			} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
}
}
