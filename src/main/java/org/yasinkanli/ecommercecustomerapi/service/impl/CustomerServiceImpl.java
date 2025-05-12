package org.yasinkanli.ecommercecustomerapi.service.impl;

import org.springframework.stereotype.Service;
import org.yasinkanli.ecommercecustomerapi.dto.CustomerRequestDto;
import org.yasinkanli.ecommercecustomerapi.dto.CustomerResponseDto;
import org.yasinkanli.ecommercecustomerapi.dto.OrderDto;
import org.yasinkanli.ecommercecustomerapi.entity.Customer;
import org.yasinkanli.ecommercecustomerapi.mapper.GenericMapper;
import org.yasinkanli.ecommercecustomerapi.repository.CustomerRepository;
import org.yasinkanli.ecommercecustomerapi.service.CustomerService;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final GenericMapper mapper;

    public CustomerServiceImpl(CustomerRepository customerRepository,
                               GenericMapper mapper) {
        this.customerRepository = customerRepository;
        this.mapper = mapper;
    }

    @Override
    public CustomerResponseDto saveCustomer(CustomerRequestDto dto) {
        Customer entity = mapper.map(dto, Customer.class);
        Customer saved = customerRepository.save(entity);

        return mapper.map(saved, CustomerResponseDto.class);
    }

    @Override
    public List<CustomerResponseDto> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();

        return mapper.mapList(customers, CustomerResponseDto.class);
    }
}