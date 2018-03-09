package com.domain.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.domain.entity.Customer;
import com.domain.repository.CustomerRepository;
import com.domain.repository.CustomerRepositoryCustom;

@Service
public class CustomerServiceImpl implements CustomerService {

  @Autowired
  private CustomerRepositoryCustom customerRepo;
  
  @Override
  public List<Customer> getAllCustomers() {
    return customerRepo.getAllCustomers();
  }

  @Override
  public Customer saveCustomer(Customer customer) {
    return customerRepo.saveCustomer(customer);
  }

}
