package com.joo.rommservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RommServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RommServicesApplication.class, args);
	}

}
