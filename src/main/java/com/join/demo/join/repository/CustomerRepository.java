package com.join.demo.join.repository;

import com.join.demo.join.dto.OrderResponse;
import com.join.demo.join.entity.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;



public interface CustomerRepository extends JpaRepository<Customer , Integer> {

    @Query("SELECT new com.join.demo.join.dto.OrderResponse( c.name , p.productName) From Customer c JOIN c.products p")
     public List<OrderResponse> getJoinInformation();
}
