package com.home.eureka.discover.retryier;

import com.home.eureka.discover.OrderResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "order", configuration = PaymentServiceConfiguration.class, fallback = PaymentServiceConfiguration.MyOrderResponse.class)
public interface OrderService {
    @RequestMapping(value = "/orders", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    OrderResponse orderMovie(OrderResponse orderResponse);
}
