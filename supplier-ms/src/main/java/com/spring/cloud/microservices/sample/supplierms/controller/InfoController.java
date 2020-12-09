package com.spring.cloud.microservices.sample.supplierms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.microservices.sample.supplierms.model.InfoSupplier;
import com.spring.cloud.microservices.sample.supplierms.service.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {
	
	@Autowired
	private InfoService infoService;

	@RequestMapping("/{state}")
	public InfoSupplier getInfoByState(@PathVariable String state) {
		return infoService.getInfoByState(state);
	}
}