package com.paritosh.eshop.productservice.controller;

import com.paritosh.eshop.productservice.entity.Product;
import com.paritosh.eshop.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/product")
    public ResponseEntity<List<Product>> findAllProducts(){
        List<Product> productList = productService.findAllProducts();
        return new ResponseEntity(productList, HttpStatus.OK);
    }
}
