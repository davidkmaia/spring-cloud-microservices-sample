package com.spring.cloud.microservices.sample.supplierms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.cloud.microservices.sample.supplierms.model.Product;
import com.spring.cloud.microservices.sample.supplierms.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getProductsBy(String state) {
		return productRepository.findByState(state);
	}
	
	
	public List<Product> getAll() {
		return (List<Product>) productRepository.findAll();
	}
	
}