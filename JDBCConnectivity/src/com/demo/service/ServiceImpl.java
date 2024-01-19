package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.Product;
import com.demo.dao.ProductdaoImpl;
import com.demo.dao.productDao;

public class ServiceImpl implements Service {
	private productDao pdao;
	public ServiceImpl() {
		pdao=new ProductdaoImpl();
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

	@Override
	public List<Product> displayAll() {
		// TODO Auto-generated method stub
		return pdao.findAll();
	}

	@Override
	public Product displaybyId(int id) {
		// TODO Auto-generated method stub
		return pdao.findbyId(id);
	}

}
