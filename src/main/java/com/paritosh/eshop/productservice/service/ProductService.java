package com.paritosh.eshop.productservice.service;

import com.paritosh.eshop.productservice.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    public List<Product> findAllProducts();


}
