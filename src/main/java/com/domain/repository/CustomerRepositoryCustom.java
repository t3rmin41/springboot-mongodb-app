package com.domain.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.Query;
import com.domain.entity.Customer;

public interface CustomerRepositoryCustom {

  @Query("{customers})")
  List<Customer> getAllCustomers();

  <T extends Customer> Customer saveCustomer(Customer customer);

  
}
