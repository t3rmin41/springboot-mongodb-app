package com.domain.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import com.domain.entity.Customer;
import com.mongodb.WriteResult;

@Repository
public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

  @Autowired
  private MongoTemplate mongoTemplate;
 
  @Override
  public List<Customer> getAllCustomers() {
    return mongoTemplate.findAll(Customer.class, "customers");
  }
  
  @Override
  public Customer saveCustomer(Customer customer) {
    mongoTemplate.save(customer);
    return customer;
  }



}
