package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {

	List<Product> getallpro();

	Product getbyid(int pid);

	void insert(Product p);

	void update(Product p);

	void delete(int pid);

}
