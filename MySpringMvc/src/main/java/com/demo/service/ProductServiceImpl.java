package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
import com.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao pdao;

	@Override
	public List<Product> getallproduct() {
		// TODO Auto-generated method stub
		return pdao.findAll();
	}

	@Override
	public void addnewprod(Product p) {
		pdao.save(p);
		
	}

	@Override
	public void deletebyid(int pid) {
		pdao.deleteById(pid);
		
	}

	@Override
	public Product getbyid(int pid) {
		Optional<Product> op=pdao.findById(pid);
		if(op.isPresent())
		{
			return op.get();
		}
		
		return null;
	}

	@Override
	public Product updatebyid(Product product) {
		Optional<Product> op=pdao.findById(product.getPid());
		if(op.isPresent()) {
			Product p=op.get();
			p.setPname(product.getPname());
			p.setQty(product.getQty());
			p.setPrice(product.getPrice());
			pdao.save(p);
			
		}
		return product;
		
	}
}
