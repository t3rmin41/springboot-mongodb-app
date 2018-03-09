package com.domain.repository;

import java.util.List;
import com.domain.entity.Customer;

public interface CustomerRepository {

  public Customer findByFirstName(String firstName);
  public List<Customer> findByLastName(String lastName);

}
