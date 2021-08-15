package com.spring.cloud.microservices.sample.shippingCompanyms.dto;

import java.time.LocalDate;

public class VoucherDTO {

	private Long number;
	
	private LocalDate deliveryForecast;
	

	public VoucherDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VoucherDTO(Long number, LocalDate deliveryForecast) {
		super();
		this.number = number;
		this.deliveryForecast = deliveryForecast;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public LocalDate getDeliveryForecast() {
		return deliveryForecast;
	}

	public void setDeliveryForecast(LocalDate deliveryForecast) {
		this.deliveryForecast = deliveryForecast;
	}

	@Override
	public String toString() {
		return "VoucherDTO [number=" + number + ", deliveryForecast=" + deliveryForecast + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deliveryForecast == null) ? 0 : deliveryForecast.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VoucherDTO other = (VoucherDTO) obj;
		if (deliveryForecast == null) {
			if (other.deliveryForecast != null)
				return false;
		} else if (!deliveryForecast.equals(other.deliveryForecast))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}
	
	
}