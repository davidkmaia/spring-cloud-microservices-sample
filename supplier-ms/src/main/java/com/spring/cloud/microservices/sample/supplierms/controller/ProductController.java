package com.spring.cloud.microservices.sample.supplierms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.microservices.sample.supplierms.model.Product;
import com.spring.cloud.microservices.sample.supplierms.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping("/{state}")
	public List<Product> getProductsBy(@PathVariable("state") String state) {
		return productService.getProductsBy(state.toUpperCase());
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Product> getAll() {
		return productService.getAll();
	}
}