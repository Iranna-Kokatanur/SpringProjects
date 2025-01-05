package com.iranna.spring_batch.repository;

import com.iranna.spring_batch.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
