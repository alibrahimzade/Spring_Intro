package com.example.lesson33.dao;

import com.example.lesson33.model.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
@RequiredArgsConstructor
public class CustomerRepositoryImpl  implements CustomerRepository{

   private  final JdbcTemplate jdbcTemplate;

    @Override
    public void save(Customer customer) {
        jdbcTemplate.update("insert into customer (name , surname , age) values (?,?,?)",
                new Object[]{customer.getName(),customer.getSurname(),customer.getAge()});
    }

    @Override
    public Customer getCustomerById(Long id) {
        Customer customer = jdbcTemplate.queryForObject("select * from customer where id = ?",
                BeanPropertyRowMapper.newInstance(Customer.class),
                id);

        return customer;
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public int delete(Long id ) {
        return jdbcTemplate.update("delete from customer where id = ?", id);
    }
}
