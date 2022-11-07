package com.evesga.beerserviceproject.web.mapper;

import com.evesga.beerserviceproject.web.domain.Customer;
import com.evesga.beerserviceproject.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDto customerToCustomerDto(Customer customer);
    Customer customerDtoToCustomer(CustomerDto customerDto);
}
