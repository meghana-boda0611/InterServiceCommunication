package com.example.customer_service.repository;


import com.example.customer_service.model.Customer;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "customers")
public class CustomerEntity {

    @Id
    private Long Custid;
    @Column
    private String Custname;
    @Column
    private String Custemail;


}
