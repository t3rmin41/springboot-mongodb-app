package com.domain.repository;

import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.domain.entity.Customer;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

  @Override
  public Customer findByFirstName(String firstName) {
    return generateCustomer();
  }

  @Override
  public List<Customer> findByLastName(String lastName) {
    return generateCustomers();
  }

  private Customer generateCustomer() {
    return new Customer().setFirstName("John").setLastName("Doe");
  }
  
  private List<Customer> generateCustomers() {
    List<Customer> customers = new LinkedList<Customer>();
    customers.add(new Customer().setFirstName("John").setLastName("Doe"));
    customers.add(new Customer().setFirstName("Fred").setLastName("Doe"));
    customers.add(new Customer().setFirstName("John").setLastName("Smith"));
    return customers;
  }
  
}
