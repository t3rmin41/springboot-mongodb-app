package com.domain.controller.rest;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.domain.entity.Customer;
import com.domain.service.CustomerService;

@Controller
@RequestMapping(value = "/customers", produces = APPLICATION_JSON_UTF8_VALUE)
public class CustomerController {

  @Autowired
  private CustomerService customerService;
  
  @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
  public @ResponseBody Customer getCustomerByFirstName(@PathVariable("name") String name) {
    return customerService.findByFirstName(name);
  }

  @RequestMapping(value = "/name/list/{name}", method = RequestMethod.GET)
  public @ResponseBody List<Customer> getCustomerByLastName(@PathVariable("name") String name) {
    return customerService.findByLastName(name);
  }
  
}
