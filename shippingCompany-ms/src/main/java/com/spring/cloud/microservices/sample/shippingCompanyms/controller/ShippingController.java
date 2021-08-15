package com.spring.cloud.microservices.sample.shippingCompanyms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.microservices.sample.shippingCompanyms.dto.ShippingDTO;
import com.spring.cloud.microservices.sample.shippingCompanyms.dto.VoucherDTO;
import com.spring.cloud.microservices.sample.shippingCompanyms.service.ShippingService;

@RestController
@RequestMapping("/shipping")
public class ShippingController {
	
	@Autowired
	private ShippingService shippingService;

	@RequestMapping(method = RequestMethod.POST)
	public VoucherDTO reservationShipping(@RequestBody ShippingDTO shippingDTO) {
		return shippingService.reservationShipping(shippingDTO);
	}
}