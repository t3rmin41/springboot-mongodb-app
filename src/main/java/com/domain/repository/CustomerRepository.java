package com.domain.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.domain.entity.Customer;

public interface CustomerRepository extends MongoRepository<Customer, Long>, CustomerRepositoryCustom {

  @Query("{customers:'?0'}")
  Customer findByFirstName(String firstName);
  
  @Query("{customers: { $regex: ?0 } })")
  List<Customer> findByLastName(String lastName);
}
