package com.spring.cloud.microservices.sample.storems.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "STORE_ORDER")
public class Order {
	
	@Id
	private Long orderId;
	private Integer preparationTime;
	private String destinationAddress;
	private Long voucherNumber;
	private LocalDate deliveryForecast;
	
	
	public Order(Long orderId, Integer preparationTime, String destinationAddress, Long voucherNumber,
			LocalDate deliveryForecast) {
		super();
		this.orderId = orderId;
		this.preparationTime = preparationTime;
		this.destinationAddress = destinationAddress;
		this.voucherNumber = voucherNumber;
		this.deliveryForecast = deliveryForecast;
	}

	public Order() {
	}
	
	public Long getVoucherNumber() {
		return voucherNumber;
	}

	public void setVoucherNumber(Long voucherNumber) {
		this.voucherNumber = voucherNumber;
	}

	public LocalDate getDeliveryForecast() {
		return deliveryForecast;
	}

	public void setDeliveryForecast(LocalDate deliveryForecast) {
		this.deliveryForecast = deliveryForecast;
	}

	public String getDestinationAddress() {
		return destinationAddress;
	}
	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Integer getPreparationTime() {
		return preparationTime;
	}
	public void setPreparationTime(Integer preparationTime) {
		this.preparationTime = preparationTime;
	}

}
