package org.yasinkanli.ecommercecustomerapi.service;

import org.yasinkanli.ecommercecustomerapi.dto.CustomerRequestDto;
import org.yasinkanli.ecommercecustomerapi.dto.CustomerResponseDto;

import java.util.List;

public interface CustomerService {
    CustomerResponseDto saveCustomer(CustomerRequestDto requestDto);
    List<CustomerResponseDto> getAllCustomers();
}