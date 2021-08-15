package com.spring.cloud.microservices.sample.shippingCompanyms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.cloud.microservices.sample.shippingCompanyms.model.Shipping;

@Repository
public interface ShippingRepository extends CrudRepository<Shipping, Long>{

}