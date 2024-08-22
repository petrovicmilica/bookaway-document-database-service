package com.example.documentdatabaseservice.repository;

import com.example.documentdatabaseservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
