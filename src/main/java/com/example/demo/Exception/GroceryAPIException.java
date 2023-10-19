package com.example.demo.Exception;

import org.springframework.http.HttpStatus;

public class GroceryAPIException extends RuntimeException {


    private HttpStatus status;

    public GroceryAPIException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }
    public GroceryAPIException(String message, HttpStatus status, String message1) {
        super(message);
        this.status = status;
        this.message = message1;
    }

    private String message;

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}