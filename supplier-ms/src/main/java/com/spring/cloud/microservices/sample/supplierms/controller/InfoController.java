package com.spring.cloud.microservices.sample.supplierms.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.microservices.sample.supplierms.model.InfoSupplier;
import com.spring.cloud.microservices.sample.supplierms.service.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {
	
	private static final Logger LOG = LoggerFactory.getLogger(InfoController.class);
	
	@Autowired
	private InfoService infoService;

	@RequestMapping("/{state}")
	public InfoSupplier getInfoByState(@PathVariable String state) {
		LOG.info("Get information of supplier of {}", state);
		return infoService.getInfoByState(state.toUpperCase());
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<InfoSupplier> findAll() {
		return infoService.findAll();
	}
}