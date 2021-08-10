package com.spring.cloud.microservices.sample.storems.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.spring.cloud.microservices.sample.storems.client.SupplierClient;
import com.spring.cloud.microservices.sample.storems.dto.InfoOrderDTO;
import com.spring.cloud.microservices.sample.storems.dto.InfoSupplierDTO;
import com.spring.cloud.microservices.sample.storems.dto.OrderDTO;
import com.spring.cloud.microservices.sample.storems.model.Order;
import com.spring.cloud.microservices.sample.storems.repository.OrderRepository;


@Service
public class OrderService {
	
	private static final Logger LOG = LoggerFactory.getLogger(OrderService.class);
	
	@Autowired
	private SupplierClient supplierClient;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@HystrixCommand(fallbackMethod = "makePurchaseFallback", threadPoolKey = "getByIdThreadPool")
	public Order getById(Long id) {
		return orderRepository.findById(id).orElse(new Order());
	}
	
	//call the fallback method that the is 'makePurchaseFallback'
	@HystrixCommand(fallbackMethod = "makePurchaseFallback", threadPoolKey = "makePurchaseThreadPool")
	public Order makePurchase(OrderDTO order) {
		
		LOG.info("Searching info of supllier of {}", order.getAddress().getState());
		InfoSupplierDTO info = supplierClient.getInfoByState(order.getAddress().getState());
		
		LOG.info("Making a order");
		InfoOrderDTO orderMaked = supplierClient.makeOrder(order.getItems());
		
		System.out.println(info.getAddress());
		Order orderSaved = orderRepository.save(new Order(orderMaked.getId(), orderMaked.getPreparationTime(), order.getAddress().toString()));
		return orderSaved;
	}

	//he fallback method
	public Order makePurchaseFallback(OrderDTO order) {
		return new Order(null, null, order.getAddress().toString());
	}

}
