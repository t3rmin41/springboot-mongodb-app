package com.domain.service;

import java.util.List;
import com.domain.entity.Customer;

public interface CustomerService {

  List<Customer> getAllCustomers();
  Customer saveCustomer(Customer customer);
  
}
