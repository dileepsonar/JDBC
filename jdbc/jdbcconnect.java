package com.dileep.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcconnect {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");

			Statement smt=con.createStatement();

			con.prepareStatement("create table emp1( eid int,esal int,ename varchar(12))");

			System.out.print("Table Created Successfully...");
			con.close();

			}

			catch (Exception e) {

			System.out.print(e);

			}

	}

}

