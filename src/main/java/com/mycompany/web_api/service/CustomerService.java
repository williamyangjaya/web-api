package com.mycompany.web_api.service;


import com.mycompany.web_api.model.Customer;
import com.mycompany.web_api.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;

    public List<Customer> getAllCustomers() {
        return iCustomerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(Long id) {
        return iCustomerRepository.findById(id);
    }

    public Customer createOrUpdateCustomer(Customer customer) {
        return iCustomerRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        iCustomerRepository.deleteById(id);
    }
}
