package com.domain.entity;

import org.springframework.data.annotation.Id;

public class Customer {

  @Id
  public String id;

  public String firstName;
  public String lastName;

  public Customer() {}

  public Customer(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public Customer setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  public Customer setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
  
  @Override
  public String toString() {
      return String.format(
              "Customer[id=%s, firstName='%s', lastName='%s']",
              id, firstName, lastName);
  }

}
