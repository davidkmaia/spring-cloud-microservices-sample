package com.spring.cloud.microservices.sample.storems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.microservices.sample.storems.dto.OrderDTO;
import com.spring.cloud.microservices.sample.storems.model.Acquisition;
import com.spring.cloud.microservices.sample.storems.service.OrderService;


@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;

	@RequestMapping(method = RequestMethod.POST)
	public Acquisition makePurchase(@RequestBody OrderDTO order) {
		return orderService.makePurchase(order);
	}
}
