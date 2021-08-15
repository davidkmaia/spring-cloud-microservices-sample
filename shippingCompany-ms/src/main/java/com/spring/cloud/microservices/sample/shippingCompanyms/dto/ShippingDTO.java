package com.spring.cloud.microservices.sample.shippingCompanyms.dto;

import java.time.LocalDate;

public class ShippingDTO {

	private Long orderId;
	
	private LocalDate deliveryForecast;
	
	private String originAddress;
	
	private String destinationAddress;
	

	public ShippingDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShippingDTO(Long orderId, LocalDate deliveryForecast, String originAddress, String destinationAddress) {
		super();
		this.orderId = orderId;
		this.deliveryForecast = deliveryForecast;
		this.originAddress = originAddress;
		this.destinationAddress = destinationAddress;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public LocalDate getDeliveryForecast() {
		return deliveryForecast;
	}

	public void setDeliveryForecast(LocalDate deliveryForecast) {
		this.deliveryForecast = deliveryForecast;
	}

	public String getOriginAddress() {
		return originAddress;
	}

	public void setOriginAddress(String originAddress) {
		this.originAddress = originAddress;
	}

	public String getDestinationAddress() {
		return destinationAddress;
	}

	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	@Override
	public String toString() {
		return "ShippingDTO [orderId=" + orderId + ", deliveryForecast=" + deliveryForecast + ", originAddress="
				+ originAddress + ", destinationAddress=" + destinationAddress + "]";
	}
	
}