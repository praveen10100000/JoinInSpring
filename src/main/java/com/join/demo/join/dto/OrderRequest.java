package com.join.demo.join.dto;

import com.join.demo.join.entity.Customer;
import com.join.demo.join.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {

    private Customer customer ;
}
