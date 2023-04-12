package com.example.lesson33.dao;

import com.example.lesson33.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CustomerRepository {

    void save(Customer customer);
    Customer getCustomerById(Long id);
    Customer update(Customer customer);
    int delete(Long id);


}
