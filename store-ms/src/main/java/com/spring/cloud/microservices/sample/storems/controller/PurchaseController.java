package com.spring.cloud.microservices.sample.storems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.microservices.sample.storems.dto.PurchaseDTO;
import com.spring.cloud.microservices.sample.storems.service.PurchaseService;


@RestController
@RequestMapping("/purchase")
public class PurchaseController {
	
	@Autowired
	private PurchaseService purchaseService;

	@RequestMapping(method = RequestMethod.POST)
	public void realizaCompra(@RequestBody PurchaseDTO purchase) {
		//purchaseService.realizaCompra(purchase);
	}
}
