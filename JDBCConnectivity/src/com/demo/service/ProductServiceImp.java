package com.demo.service;

import java.util.Scanner;

import com.demo.bean.Product;
import com.demo.dao.ProductDaoImpl;
import com.demo.dao.Productdao;

public class ProductServiceImp implements ProductService {
     static Productdao pdao= null;
      public ProductServiceImp() {
		pdao=new ProductDaoImpl();
	}
	@Override
	public void addproduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr pid");
		int pid=sc.nextInt();
		System.out.println("enetr Name");
		String pnm=sc.next();
		System.out.println("enetr qty");
		int qty=sc.nextInt();
		System.out.println("enetr price");
		double price=sc.nextDouble();
		Product p=new Product(pid,pnm,qty,price);
		pdao.save(p);
		
	}

}
