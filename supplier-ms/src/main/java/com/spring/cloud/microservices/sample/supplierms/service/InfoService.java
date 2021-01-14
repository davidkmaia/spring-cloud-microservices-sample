package com.spring.cloud.microservices.sample.supplierms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.cloud.microservices.sample.supplierms.model.InfoSupplier;
import com.spring.cloud.microservices.sample.supplierms.repository.InfoRepository;

@Service
public class InfoService {

	@Autowired
	private InfoRepository infoRepository;
	
	public InfoSupplier getInfoByState(String state) {
		return infoRepository.findByState(state);
	}

	public List<InfoSupplier> findAll() {
		return (List<InfoSupplier>) infoRepository.findAll();
	}
}
