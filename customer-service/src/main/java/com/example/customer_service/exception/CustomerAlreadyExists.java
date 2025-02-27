package com.example.customer_service.exception;

public class CustomerAlreadyExists extends RuntimeException{

    public CustomerAlreadyExists(String message){
        super(message);
    }
}


