package com.home.eureka.discover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaDiscoverApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaDiscoverApplication.class, args);
	}
}
