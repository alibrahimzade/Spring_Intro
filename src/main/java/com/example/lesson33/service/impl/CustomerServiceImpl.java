package com.example.lesson33.service.impl;

import com.example.lesson33.dao.CustomerRepository;
import com.example.lesson33.dao.CustomerRepositoryImpl;
import com.example.lesson33.model.Customer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerServiceImpl {
    private final CustomerRepository customerRepository;

    public void save(Customer customer){
        log.info("Saving has started{}",customer);
        customerRepository.save(customer);
        log.info("Saving has ended{}",customer);
    }

    public Customer findById(Long id){
        return customerRepository.getCustomerById(id);
    }

    public int delete(Long id){
        return customerRepository.delete(id);
    }
}
