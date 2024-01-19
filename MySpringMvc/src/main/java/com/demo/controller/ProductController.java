package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService ps=new ProductServiceImpl();
	
	
	@RequestMapping("/prod")
	public ModelAndView getAllProduct(HttpSession ses) {
		List<Product> plist=ps.getallproduct();
		return new ModelAndView("display","plist",plist);
	}
	
	@GetMapping("/addproduct")
	public ModelAndView display()
	{
		return new ModelAndView("addproduct");
	}
	
	@PostMapping("/insert")
	public ModelAndView insertProd(@RequestParam int pid , @RequestParam String pname,@RequestParam int qty, @RequestParam double price) {
		Product p=new Product(pid,pname,qty,price);
		ps.addnewprod(p);
		return new ModelAndView("redirect:/product/prod");
	}
	
	@GetMapping("/delete/{pid}")
	public ModelAndView delete(@PathVariable int pid)
	{
		ps.deletebyid(pid);
		return new ModelAndView("redirect:/product/prod");

	}
	
	@GetMapping("/edit/{pid}")
	public ModelAndView update(@PathVariable int pid)
	{
		Product p=ps.getbyid(pid);
		return new ModelAndView("edit","p",p); 
		
	}
	@PostMapping("/update")
	public ModelAndView update(@RequestParam int pid , @RequestParam String pname,@RequestParam int qty, @RequestParam double price) {
		Product p=ps.updatebyid(new Product(pid,pname,qty,price));
		return new ModelAndView("redirect:/product/prod");
	}

}
