package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService ps=new ProductServiceImpl();
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getallproduct()
	{
		List<Product> lst=ps.getallpro();
		return ResponseEntity.ok(lst);
	}
	
	@GetMapping("/products/{pid}")
	public ResponseEntity<Product> getbyId(@PathVariable int pid)
	{
		Product p=ps.getbyid(pid);
		return ResponseEntity.ok(p);
	}
	@PostMapping("products/{pid}")
	public ResponseEntity<String> insertproduct(@RequestBody Product p)
	{
		ps.insert(p);
		return ResponseEntity.ok("Data Inserted");
		
	}
    @PutMapping("products/{pid}")
	public ResponseEntity<String> updateproduct(@RequestBody Product p)
	{
		ps.update(p);
		return ResponseEntity.ok("Data Updated");
	}
	@DeleteMapping("products/{pid}")
	public ResponseEntity<String> deleteproduct(@PathVariable int pid)
	{
		ps.delete(pid);
		return ResponseEntity.ok("Data deleted");
		
	}
}
