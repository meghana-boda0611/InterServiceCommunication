package com.example.customer_service.controller;


import com.example.customer_service.model.Customer;
import com.example.customer_service.repository.CustomerEntity;
import com.example.customer_service.service.CustomerService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService custservice;

    @GetMapping("/customers")
    public List<CustomerEntity> getCustomers(){
        return custservice.getCustomerdetails();
    }

    @GetMapping("/customers/{id}")
    public CustomerEntity getCustomer(@PathVariable Long id){
        return custservice.getCustomerbyId(id);
    }

    @PostMapping("/customers/newcustomer")
    public void creaeNewCustomer(@RequestBody Customer c){
        custservice.createCustomer(c);
    }



}
