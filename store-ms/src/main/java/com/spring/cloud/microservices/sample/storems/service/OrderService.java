package com.spring.cloud.microservices.sample.storems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.spring.cloud.microservices.sample.storems.dto.InfoSupplierDTO;
import com.spring.cloud.microservices.sample.storems.dto.OrderDTO;

@Service
public class OrderService {
	
	@Autowired
	private RestTemplate client;

	public void makePurchase(OrderDTO purchase) {
		ResponseEntity<InfoSupplierDTO> exchange = client.exchange("http://supplier/info/" + purchase
				.getAddress().getState(),  HttpMethod.GET, null, InfoSupplierDTO.class);
		
		System.out.println(exchange.getBody().getAddress());
	}

}
