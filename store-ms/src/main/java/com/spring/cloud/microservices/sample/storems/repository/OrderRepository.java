package com.spring.cloud.microservices.sample.storems.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.cloud.microservices.sample.storems.model.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long>{

}
