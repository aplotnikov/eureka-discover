package com.home.eureka.discover;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class PaymentService {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/payment", method = POST, produces = "application/json")
    public ResponseEntity<OrderId> payForMovie(@RequestBody OrderId orderId) {
        OrderId result = orderService.orderMovie(orderId);

        return new ResponseEntity<>(result, CREATED);
    }
}
