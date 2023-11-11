package com.microservices.productservices.repository;

import com.microservices.productservices.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
