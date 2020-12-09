package com.spring.cloud.microservices.sample.supplierms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.cloud.microservices.sample.supplierms.model.InfoSupplier;

@Repository
public interface InfoRepository extends CrudRepository<InfoSupplier, Long>{
	
	InfoSupplier findByState(String state);
	
}
