package com.spring.cloud.microservices.sample.storems.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.cloud.microservices.sample.storems.dto.ShippingInfoDTO;
import com.spring.cloud.microservices.sample.storems.dto.VoucherDTO;

//informer the id of application to access "shipping"
@FeignClient("shipping")
public interface ShippingClient {

	@RequestMapping(value = "/shipping", method = RequestMethod.POST)
	VoucherDTO reservationShipping(@RequestBody ShippingInfoDTO shippingDTO);
	
}
