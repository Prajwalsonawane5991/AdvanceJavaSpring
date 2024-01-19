package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbcconnection {
        public static void main(String[] args)
        {
        	try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://localhost:3306/prajwal?useSSL=false";
				Connection con=DriverManager.getConnection(url,"root","Prajwal@1326");
				if (con!=null) {
					System.out.println("connection done");
				}
        	} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
        	
        }
}
