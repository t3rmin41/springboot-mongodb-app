package com.domain.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.domain.entity.Customer;
import com.domain.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

  @Autowired
  private CustomerRepository customerRepo;
  
  @Override
  public Customer findByFirstName(String name) {
    return customerRepo.findByFirstName(name);
  }

  @Override
  public List<Customer> findByLastName(String name) {
    return customerRepo.findByLastName(name);
  }

}
