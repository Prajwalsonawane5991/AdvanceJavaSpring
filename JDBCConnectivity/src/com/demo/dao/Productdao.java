package com.demo.dao;

import java.util.List;

import com.demo.bean.Product;

public interface productDao {

	void save(Product p);
	List<Product> findAll();
	Product findbyId(int id);


}
