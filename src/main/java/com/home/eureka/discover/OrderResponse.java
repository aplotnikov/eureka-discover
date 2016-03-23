package com.home.eureka.discover;

public class OrderResponse {
    private String id;
    private String exception;

    public OrderResponse() {
    }

    public OrderResponse(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }
}
