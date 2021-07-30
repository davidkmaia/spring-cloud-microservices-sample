package com.spring.cloud.microservices.sample.supplierms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.microservices.sample.supplierms.dto.OrderItemDTO;
import com.spring.cloud.microservices.sample.supplierms.model.Order;
import com.spring.cloud.microservices.sample.supplierms.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping(method = RequestMethod.POST)
	public Order realizaOrder(@RequestBody List<OrderItemDTO> products) {
		return orderService.makeOrder(products);
	}
	
	@RequestMapping("/{id}")
	public Order getOrderBy(@PathVariable Long id) {
		return orderService.getOrderById(id);
	}
}