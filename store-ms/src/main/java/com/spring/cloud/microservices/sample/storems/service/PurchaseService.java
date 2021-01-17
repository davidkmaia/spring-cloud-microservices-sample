package com.spring.cloud.microservices.sample.storems.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.spring.cloud.microservices.sample.storems.dto.InfoSupplierDTO;
import com.spring.cloud.microservices.sample.storems.dto.PurchaseDTO;

@Service
public class PurchaseService {

	public void makePurchase(PurchaseDTO purchase) {
		RestTemplate client = new RestTemplate();
		ResponseEntity<InfoSupplierDTO> exchange = client.exchange("http://supplier/info" + purchase
				.getAddress().getState(),  HttpMethod.GET, null, InfoSupplierDTO.class);
		
	}

}
