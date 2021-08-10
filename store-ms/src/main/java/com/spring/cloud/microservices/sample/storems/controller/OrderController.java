package com.spring.cloud.microservices.sample.storems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.microservices.sample.storems.dto.OrderDTO;
import com.spring.cloud.microservices.sample.storems.model.Order;
import com.spring.cloud.microservices.sample.storems.service.OrderService;


@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;

	@RequestMapping(method = RequestMethod.POST)
	public Order makePurchase(@RequestBody OrderDTO order) {
		return orderService.makePurchase(order);
	}
	
	@RequestMapping("/{id}")
	public Order getById(@PathVariable("id") Long id) {
		return orderService.getById(id);
	}
}
