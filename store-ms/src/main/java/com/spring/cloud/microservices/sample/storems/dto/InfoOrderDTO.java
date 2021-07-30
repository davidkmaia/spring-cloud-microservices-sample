package com.spring.cloud.microservices.sample.storems.dto;

public class InfoOrderDTO {
	
	private Long id;
	private Integer preparationTime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getPreparationTime() {
		return preparationTime;
	}
	public void setPreparationTime(Integer preparationTime) {
		this.preparationTime = preparationTime;
	}
}
