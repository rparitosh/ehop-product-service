package com.paritosh.eshop.productservice.repository;

import com.paritosh.eshop.productservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
