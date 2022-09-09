package com.paritosh.eshop.productservice.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Slf4j
public class Product {
    @Id
    Long Id;
    String Name;
    String description;
}
