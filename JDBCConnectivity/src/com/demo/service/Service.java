package com.demo.service;

import java.util.List;

import com.demo.bean.Product;

public interface Service {

	void addproduct();

	List<Product> displayAll();

     Product displaybyId(int id);

	

}
