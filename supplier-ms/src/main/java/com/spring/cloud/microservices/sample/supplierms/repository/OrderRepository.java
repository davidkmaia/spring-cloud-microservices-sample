package com.spring.cloud.microservices.sample.supplierms.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.cloud.microservices.sample.supplierms.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
