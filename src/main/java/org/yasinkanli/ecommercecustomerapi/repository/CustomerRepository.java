package org.yasinkanli.ecommercecustomerapi.repository;

import org.springframework.stereotype.Repository;
import org.yasinkanli.ecommercecustomerapi.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}