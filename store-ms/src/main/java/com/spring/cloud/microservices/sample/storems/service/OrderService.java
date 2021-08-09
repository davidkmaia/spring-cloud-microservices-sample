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
import com.spring.cloud.microservices.sample.storems.model.Acquisition;


@Service
public class OrderService {
	
	private static final Logger LOG = LoggerFactory.getLogger(OrderService.class);
	
	@Autowired
	private SupplierClient supplierClient;
	
	//call the fallback method that the is 'makePurchaseFallback'
	@HystrixCommand(fallbackMethod = "makePurchaseFallback")
	public Acquisition makePurchase(OrderDTO order) {
		
		LOG.info("Searching info of supllier of {}", order.getAddress().getState());
		InfoSupplierDTO info = supplierClient.getInfoByState(order.getAddress().getState());
		
		LOG.info("Making a order");
		InfoOrderDTO orderSaved = supplierClient.makeOrder(order.getItems());
		
		System.out.println(info.getAddress());
		
		return new Acquisition(orderSaved.getId(), orderSaved.getPreparationTime(), order.getAddress().toString());
	}

	//he fallback method
	public Acquisition makePurchaseFallback(OrderDTO order) {
		return new Acquisition(null, null, order.getAddress().toString());
	}

}
