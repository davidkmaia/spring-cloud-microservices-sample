package com.spring.cloud.microservices.sample.storems.dto;

public class AddressDTO {

	private String street;
	
	private int number;
	
	private String state;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "AddressDTO [street=" + street + ", number=" + number + ", state=" + state + "]";
	}
	
	
}
