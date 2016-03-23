package com.home.eureka.discover.retryier;

import com.home.eureka.discover.ExcludedFromScan;
import com.home.eureka.discover.OrderResponse;
import feign.RetryableException;
import feign.codec.ErrorDecoder;
import org.springframework.cloud.netflix.feign.FeignClientsConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ExcludedFromScan
public class PaymentServiceConfiguration extends FeignClientsConfiguration {
    @Bean
    public MyOrderResponse myOrderService() {
        return new MyOrderResponse();
    }

    @Bean
    public ErrorDecoder errorDecoder() {
        return (methodKey, response) -> {
            if (response.status() == 503) {
                return new RetryableException("retry", null);
            }

            return new ErrorDecoder.Default().decode(methodKey, response);
        };
    }

    public class MyOrderResponse implements OrderService {
        @Override
        public OrderResponse orderMovie(OrderResponse orderRequest) {
            OrderResponse orderResponse = new OrderResponse();
            orderResponse.setException("Sorry try again later");

            return orderResponse;
        }
    }
}
