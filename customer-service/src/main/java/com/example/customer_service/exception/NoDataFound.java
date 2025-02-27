package com.example.customer_service.exception;

public class NoDataFound extends RuntimeException{

    public NoDataFound(String message){
        super(message);
    }
}