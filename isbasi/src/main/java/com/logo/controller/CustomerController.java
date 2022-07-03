package com.logo.controller;


import com.logo.model.Customer;
import com.logo.model.User;
import com.logo.service.CustomerService;
import com.logo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/insert")
    public Customer createCustomer(@RequestBody Customer customerRequest) {
        return customerService.createCustomer(customerRequest);
    }

    @GetMapping
    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }

    @PutMapping("/update/{id}")
    public Customer updateCustomer(Customer customer) {
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("/delete/{customerId}")
    @ResponseStatus(code = HttpStatus.OK)
    public void deleteCustomer(@PathVariable Integer customerId) {
        customerService.deleteCustomerById(customerId);
    }

    @GetMapping("/getCustomerByName/{name}")
    public Customer getCustomerByName(@PathVariable String name) {

        return customerService.getCustomerByName(name);
    }


}
