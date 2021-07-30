package com.spring.cloud.microservices.sample.storems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.cloud.microservices.sample.storems.client.SupplierClient;
import com.spring.cloud.microservices.sample.storems.dto.InfoOrderDTO;
import com.spring.cloud.microservices.sample.storems.dto.InfoSupplierDTO;
import com.spring.cloud.microservices.sample.storems.dto.OrderDTO;
import com.spring.cloud.microservices.sample.storems.model.Acquisition;

@Service
public class OrderService {
	
	@Autowired
	private SupplierClient supplierClient;
	
	public Acquisition makePurchase(OrderDTO order) {
		
		InfoSupplierDTO info = supplierClient.getInfoByState(order.getAddress().getState());
		
		InfoOrderDTO orderSaved = supplierClient.makeOrder(order.getItems());
		
		System.out.println(info.getAddress());
		
		return new Acquisition(orderSaved.getId(), orderSaved.getPreparationTime(), order.getAddress().toString());
	}

}
