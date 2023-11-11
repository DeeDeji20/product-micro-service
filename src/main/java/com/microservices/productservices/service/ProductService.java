package com.microservices.productservices.service;

import dto.request.ProductRequest;

public interface ProductService {
    void createProduct(ProductRequest productRequest);
}
