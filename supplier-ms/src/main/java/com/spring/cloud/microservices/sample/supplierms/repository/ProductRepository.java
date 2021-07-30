package com.spring.cloud.microservices.sample.supplierms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.cloud.microservices.sample.supplierms.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

	List<Product> findByState(String state);
	
	List<Product> findByIdIn(List<Long> ids);
}
