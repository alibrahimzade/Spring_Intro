package com.example.lesson33.controller;

import com.example.lesson33.model.Customer;
import com.example.lesson33.service.impl.CustomerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {

    public final CustomerServiceImpl customerService;

    @PostMapping("/create")
    public void createCustomer(@RequestBody Customer customer){

        customerService.save(customer);
    }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id){
        return customerService.findById(id);
    }


    @DeleteMapping("/delete")
    public int deleteCustomer(@RequestParam Long id){
        return  customerService.delete(id);
    }
}
