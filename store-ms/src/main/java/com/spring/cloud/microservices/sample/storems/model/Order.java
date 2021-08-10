package com.spring.cloud.microservices.sample.storems.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "STORE_ORDER")
public class Order {
	
	@Id
	private Long orderId;
	private Integer preparationTime;
	private String destinationAddress;
	
	

	public Order(Long orderId, Integer preparationTime, String destinationAddress) {
		super();
		this.orderId = orderId;
		this.preparationTime = preparationTime;
		this.destinationAddress = destinationAddress;
	}
	
	public Order() {
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
