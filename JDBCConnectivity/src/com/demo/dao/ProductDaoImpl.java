package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.bean.Product;

public class ProductdaoImpl  implements productDao{
      public static Connection con;
      static PreparedStatement insproduct,selectprod,selctbyId;
      static{
    	  try {
    		  con=DBunit.getMyConnection();
    		  selectprod=con.prepareStatement("select * from product1");
			insproduct=con.prepareStatement("insert into product1 values(?,?,?,?)");
			selctbyId=con.prepareStatement("select * from product1 where id=?");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
  	public List<Product> findAll() {
		List<Product> plist=new ArrayList<>();
		try {
			ResultSet rs=selectprod.executeQuery();
			while(rs.next()) {
			    plist.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4)));
			}
			return plist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public void save(Product p) {
		
		try {
			insproduct.setInt(1,p.getId());
			insproduct.setString(2,p.getPnm());
			insproduct.setInt(3,p.getQty());
			insproduct.setDouble(4,p.getPrice());
			int n=insproduct.executeUpdate();
			
		}catch(SQLException e)
		{
			e.getMessage();
		}
	}
	@Override
	public Product findbyId(int id) {
		try {
			selctbyId.setInt(1, id);
			ResultSet rs1=selctbyId.executeQuery();
			if(rs1.next()) {
				return new Product(rs1.getInt(1),rs1.getString(2),rs1.getInt(3),rs1.getDouble(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
