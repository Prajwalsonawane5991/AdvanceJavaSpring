package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {

	List<Product> getallproduct();

	void addnewprod(Product p);

	void deletebyid(int pid);

	Product getbyid(int pid);

	Product updatebyid(Product product);

}
