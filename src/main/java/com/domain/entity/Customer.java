package com.domain.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers")
public class Customer {

  @Id
  @Indexed(unique = true)
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
