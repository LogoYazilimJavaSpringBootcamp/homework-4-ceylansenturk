package com.logo.repository;

import com.logo.model.Customer;
import com.logo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    void delete(Customer foundCustomer);

    Optional<Customer> findByName(String name);

}
