package com.join.demo.join.repository;

import com.join.demo.join.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product , Integer> {


}
