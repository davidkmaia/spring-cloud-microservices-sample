package com.spring.cloud.microservices.sample.shippingCompanyms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShippingCompanyMsApplication {

	public static void main(String[] args) {
		System.setProperty("spring.cloud.bootstrap.enabled","true");
		SpringApplication.run(ShippingCompanyMsApplication.class, args);
	}

}
