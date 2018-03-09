package com.domain.service;

import java.util.List;
import com.domain.entity.Customer;

public interface CustomerService {

  Customer findByFirstName(String name);
  List<Customer> findByLastName(String name);
  
}
