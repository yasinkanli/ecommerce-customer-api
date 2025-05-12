package org.yasinkanli.ecommercecustomerapi.controller;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yasinkanli.ecommercecustomerapi.dto.CustomerRequestDto;
import org.yasinkanli.ecommercecustomerapi.dto.CustomerResponseDto;
import org.yasinkanli.ecommercecustomerapi.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(path = "/all")
    public List<CustomerResponseDto> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping(path = "/create")
    public CustomerResponseDto createCustomer(@Valid @RequestBody CustomerRequestDto requestDto) {
        return customerService.saveCustomer(requestDto);
    }


}