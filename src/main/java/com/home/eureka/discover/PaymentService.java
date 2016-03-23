package com.home.eureka.discover;

import com.home.eureka.discover.retryier.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodHandles;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class PaymentService {
    private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/payment", method = POST, produces = "application/json")
    public ResponseEntity<OrderResponse> payForMovie(@RequestBody OrderResponse orderResponse) {
        LOG.info("my message " + orderResponse.getId());

        OrderResponse result = orderService.orderMovie(orderResponse);

        return new ResponseEntity<>(result, CREATED);
    }
}
