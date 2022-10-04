package com.example.apigateaway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApiGateawayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGateawayApplication.class, args);
	}

}
