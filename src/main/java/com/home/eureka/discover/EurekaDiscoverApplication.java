package com.home.eureka.discover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@ComponentScan(excludeFilters = {@Filter(type = FilterType.ANNOTATION, value = ExcludedFromScan.class)})
public class EurekaDiscoverApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaDiscoverApplication.class, args);
    }
}
