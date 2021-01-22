package com.spring.cloud.microservices.sample.storems.dto;

import java.util.List;

public class OrderDTO {

	private List<OrderItemDTO> items;
	
	private AddressDTO address;

	public List<OrderItemDTO> getItems() {
		return items;
	}

	public void setItems(List<OrderItemDTO> items) {
		this.items = items;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}
}
