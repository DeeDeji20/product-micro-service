package com.microservices.productservices.service;

import com.microservices.productservices.dto.request.ProductRequest;
import com.microservices.productservices.dto.response.ProductResponse;

import java.util.List;

public interface ProductService {
    void createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();
}
