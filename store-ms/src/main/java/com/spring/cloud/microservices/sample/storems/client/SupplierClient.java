package com.spring.cloud.microservices.sample.storems.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.cloud.microservices.sample.storems.dto.InfoSupplierDTO;

//informer the id of application to access "supplier"
@FeignClient("supplier")
public interface SupplierClient {

	@RequestMapping("/info/{state}")
	InfoSupplierDTO getInfoByState(@PathVariable String state);
	
}
