package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStatement {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/prajwal";
			Connection con=DriverManager.getConnection(url,"root","Prajwal@1326");
		   Statement st= con.createStatement();
			ResultSet rs=st.executeQuery("select * from station");
			while(rs.next())
			{
				System.out.println("====================================");
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt(4));
				System.out.println(rs.getInt(5));
			}
			
			int id=34;
			String pnm="chair";
            int qty=56;
            double pr=3456;
            String query="insert into product1 values("+id+",'"+pnm+"',"+qty+","+pr+")";
            System.out.println(query);
		    int n=st.executeUpdate(query);
		    if(n>0) {
		    	System.out.println("added sucessfully");
		    }
		  
		  
		}
		catch(SQLException e)
		{
			e.getMessage();
		}

	}

}
