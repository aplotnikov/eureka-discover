package com.home.eureka.discover;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class PaymentService {
    @RequestMapping(value = "/payment", method = POST, produces = "application/json")
    public ResponseEntity<String> payForMovie(@RequestBody OrderId orderId) {
        return new ResponseEntity<>(orderId.getId(), CREATED);
    }
}
