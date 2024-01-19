package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatement1 {
  public static void main(String[] args) {
	try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		String url="jdbc:mysql://localhost:3306/prajwal";
		Connection con=DriverManager.getConnection(url,"root","Prajwal@1326");
		
//			
		PreparedStatement st=con.prepareStatement("select * from product1");
			ResultSet rs=st.executeQuery();
		  while(rs.next()) {
				System.out.println("Pid: "+rs.getInt(1));
				System.out.println("Pname: "+rs.getString(2));
				System.out.println("Quantity: "+rs.getInt(3));
				System.out.println("Price: "+rs.getDouble(4));
				System.out.println("==================================");
				
		  }
				int id=31;
				String pnm="Table";
	            int qty=56;
	            double pr=3456;
	            PreparedStatement st1=con.prepareStatement("insert into product1 values(?,?,?,?)");
	            st1.setInt(1, id);
	            st1.setString(2, pnm);
	            st1.setInt(3,qty);
	            st1.setDouble(4, pr);
			    int n=st1.executeUpdate();
			    if(n>0) {
			    	System.out.println("added sucessfully");
			    
			
		}		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

private ResultSet executeQuery() {
	// TODO Auto-generated method stub
	return null;
}
}
