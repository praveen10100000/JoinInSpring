package com.join.demo.join.controller;

import com.join.demo.join.dto.OrderRequest;
import com.join.demo.join.dto.OrderResponse;
import com.join.demo.join.entity.Customer;
import com.join.demo.join.repository.CustomerRepository;
import com.join.demo.join.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private CustomerRepository customerRepository ;

    @Autowired
    private ProductRepository productRepository ;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest orderRequest)
    {
        return customerRepository.save(orderRequest.getCustomer());
    }

    @GetMapping("/findAllOrder")
    public List<Customer> findAllOrder()
    {
        return customerRepository.findAll();
    }

    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInformation(){
        return customerRepository.getJoinInformation();
    }

}
