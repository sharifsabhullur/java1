package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Infosys {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/infosyshiring", "root", "root");
		Statement statement = connection.createStatement();
//		statement.execute("insert into infosys values(301,'sharif',22,'male',63625076,'juniorsoftengg',25000.0)");
//		statement.execute("insert into infosys values(302,'harsha',50,'male',81625076,'seniorsoftengg',50000.0)");
//		statement.execute("insert into infosys values(303,'kavya',40,'female',73625076,'juniorsoftengg',45000.0)");
//		statement.execute("insert into infosys values(304,'raju',25,'male',99625076,'seniorsoftengg',30000.0)");
//		statement.execute("insert into infosys values(305,'hasen',22,'male',63625076,'juniorsoftengg',35000.0)");
//		statement.execute("insert into infosys values(306,'shamid',50,'male',63250766,'seniorsoftengg',25000.0)");
//		statement.execute("insert into infosys values(307,'shekhu',45,'male',816250766,'juniorengg',35000.0)");
//		statement.execute("insert into infosys values(308,'saddu',60,'male',996250766,'seniorsoftengg',2500000.0)");
//		statement.execute("insert into infosys values(309,'madina',40,'female',6362500766,'juniorsoftengg',40000.0)");
//		statement.execute("insert into infosys values(310,'noorjaha',30,'female',73625076,'seniorsoftengg',70000.0)");
		statement.execute("insert into infosys values(311,'ruthic',30,'male',99625076,'seniorsoftengg',70000.0)");
			connection.close();
			System.out.println("data saved");
			} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}

}
