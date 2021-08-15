package com.spring.cloud.microservices.sample.shippingCompanyms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.cloud.microservices.sample.shippingCompanyms.dto.ShippingDTO;
import com.spring.cloud.microservices.sample.shippingCompanyms.dto.VoucherDTO;
import com.spring.cloud.microservices.sample.shippingCompanyms.model.Shipping;
import com.spring.cloud.microservices.sample.shippingCompanyms.repository.ShippingRepository;

@Service
public class ShippingService {
	
	@Autowired
	private ShippingRepository repository;

	public VoucherDTO reservationShipping(ShippingDTO pedidoDTO) {
		
		Shipping shipping = new Shipping();
		shipping.setDateToGet(pedidoDTO.getDeliveryForecast());
		shipping.setDeliveryForecast(pedidoDTO.getDeliveryForecast().plusDays(1l));
		shipping.setDestinationAddress(pedidoDTO.getDestinationAddress());
		shipping.setOriginAddress(pedidoDTO.getOriginAddress());
		shipping.setOrderId(pedidoDTO.getOrderId());
		
		repository.save(shipping);
		
		return new VoucherDTO(shipping.getId(), shipping.getDeliveryForecast());
	}

}