package com.example.customer_service.service;

import com.example.customer_service.exception.CustomerAlreadyExists;
import com.example.customer_service.exception.NoDataFound;
import com.example.customer_service.model.Customer;
import com.example.customer_service.repository.CustomerEntity;
import com.example.customer_service.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerrepo;

    public List<CustomerEntity> getCustomerdetails() {
        List<CustomerEntity> customers= customerrepo.findAll();
       if (customers.isEmpty()){
            throw new NoDataFound("There is no data to get in table");
        }
       return customers;
//        if (customerrepo.count() == 0){
//            throw new NoDataFound("There is no data to get in table");
//        }
//        return customerrepo.findAll();
    }

    public CustomerEntity getCustomerbyId(Long id){
        Optional<CustomerEntity> opt=customerrepo.findById(id);
        return opt.get();
    }
    public void createCustomer(Customer c){
        CustomerEntity ce = new CustomerEntity();
       if (customerrepo.existsById(c.getCustid())){
           throw new CustomerAlreadyExists("Customer Already Exists");
       }
        ce.setCustid(c.getCustid());
        ce.setCustname(c.getCustname());
        ce.setCustemail(c.getCustemail());
        customerrepo.save(ce);

    }
}


