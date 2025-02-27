package com.example.customer_service.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class Customer {
    private Long Custid;
    private String Custname;
    private String Custemail;

}
