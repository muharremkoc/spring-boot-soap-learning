package com.soap.springbootsoapservice.service;

import com.soap.springbootsoapservice.model.Customer;

public interface CustomerService {

    void  addCustomer(Customer customer);

    Customer getCustomer(long id);

    void updateCustomer(Customer customer);

    void deleteCustomer(long id);

}
