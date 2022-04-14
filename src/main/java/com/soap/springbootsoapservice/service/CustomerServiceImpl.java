package com.soap.springbootsoapservice.service;

import com.soap.springbootsoapservice.model.Customer;
import com.soap.springbootsoapservice.repository.CustomerRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerServiceImpl implements CustomerService{

    final CustomerRepository customerRepository;

    @Override
    public void addCustomer(Customer customer) {
           customerRepository.save(customer);
    }

    @Override
    public Customer getCustomer(long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void updateCustomer(Customer customer) {
         Customer customer1=customerRepository.findById(customer.getCustomerID());
         customer1.setFirstName(customer.getFirstName());
        customer1.setLastName(customer.getLastName());
        customerRepository.save(customer1);
    }


    @Override
    public void deleteCustomer(long id) {
           customerRepository.deleteById(id);
    }
}
