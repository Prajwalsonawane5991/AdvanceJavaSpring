package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.demo.bean.Product;

public class ProductDaoImpl implements Productdao {
       static Connection con= null;
       static PreparedStatement inspro;
       static {
    	   try {
    	   con=DButil.getconnection();
    	   inspro=con.prepareStatement("insert into product values(?,?,?,?)");
    	   }
    	   catch(SQLException e)
    	   {
    		   e.getMessage();
    	   }
    	   
       }
	@Override
	public void save(Product p) {
		try {
			inspro.setInt(1, p.getPid());
			inspro.setString(2,p.getPnm());
			inspro.setInt(3, p.getQty());
			inspro.setDouble(4,p.getPrice());
			int n=inspro.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
