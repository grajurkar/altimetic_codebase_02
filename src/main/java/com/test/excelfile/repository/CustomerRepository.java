package com.test.excelfile.repository;

import org.springframework.data.repository.CrudRepository;

import com.test.excelfile.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{
}
