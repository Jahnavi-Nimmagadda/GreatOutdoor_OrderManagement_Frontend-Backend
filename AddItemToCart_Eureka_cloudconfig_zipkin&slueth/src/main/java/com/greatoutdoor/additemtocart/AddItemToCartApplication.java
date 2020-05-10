package com.greatoutdoor.additemtocart;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AddItemToCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddItemToCartApplication.class, args);
	}

}
