package com.dileep.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
		PreparedStatement psmt=con.prepareStatement("insert into emp1 values(?,?,?)");
		BufferedReader br=new BufferedReader( new InputStreamReader (System.in));
		while(true)
			
		{
			System.out.println("enter eid:");
			int eid=Integer.parseInt(br.readLine());
			System.out.println("enter ename :");
			String ename=br.readLine();
			System.out.println("enter  esal:");
			int esal=Integer.parseInt(br.readLine());
			
			psmt.setInt(1, eid);
			psmt.setInt(2, esal);
			psmt.setString(3, ename);
			
			int count=psmt.executeUpdate();
			if(count>0)
			{
				System.out.println(count+ "rocord inserted");
			}else {
				System.out.println(count+ "rocord  not inserted");
				System.out.println (" do u want to add rocord  [ yes/no]");
				String ch=br.readLine();
				if(ch.equalsIgnoreCase("no"));
				break;
				
			}
			
			
		}
		
		
		
	}

}
