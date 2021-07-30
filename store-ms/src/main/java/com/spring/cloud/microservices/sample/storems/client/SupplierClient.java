package com.spring.cloud.microservices.sample.storems.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.cloud.microservices.sample.storems.dto.InfoOrderDTO;
import com.spring.cloud.microservices.sample.storems.dto.InfoSupplierDTO;
import com.spring.cloud.microservices.sample.storems.dto.OrderItemDTO;

//informer the id of application to access "supplier"
@FeignClient("supplier")
public interface SupplierClient {

	@RequestMapping("/info/{state}")
	InfoSupplierDTO getInfoByState(@PathVariable String state);

	@RequestMapping(method = RequestMethod.POST, value = "/order")
	InfoOrderDTO makeOrder(List<OrderItemDTO> items);
	
}
