package com.codelovin.microservices.operandsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OperandsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OperandsServiceApplication.class, args);
	}

}
