package com.home.eureka.discover;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("order")
public interface OrderService {
    @RequestMapping(value = "/orders", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    OrderId orderMovie(OrderId orderId);
}
