package com.spring.cloud.microservices.sample.storems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.spring.cloud.microservices.sample.storems.client.SupplierClient;
import com.spring.cloud.microservices.sample.storems.dto.InfoSupplierDTO;
import com.spring.cloud.microservices.sample.storems.dto.OrderDTO;

@Service
public class OrderService {
	
	@Autowired
	private SupplierClient supplierClient;
	
	public void makePurchase(OrderDTO order) {
		
		InfoSupplierDTO info = supplierClient.getInfoByState(order.getAddress().getState());
		
		System.out.println(info.getAddress());
	}

}
