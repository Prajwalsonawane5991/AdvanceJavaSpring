package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
   static Connection  con=null;
   public static Connection  getconnection(){
   try {
	   if(con==null)
	   {
		   DriverManager.registerDriver( new com.mysql.cj.jdbc.Driver());
		   String url="jdbc:mysql://192.168.10.150:3306/dac39?useSSL=false";
		   DriverManager.getConnection(url,"dac39","welcome");
	   }
      }catch(SQLException e)
   {  e.getMessage();
    	  
   }
return con;
   }
   
   public static void closeconnection()
   {
	   if(con!=null)
	   {
		   try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	   
   }
   
}
