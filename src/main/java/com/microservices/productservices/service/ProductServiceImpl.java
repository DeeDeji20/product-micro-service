package com.microservices.productservices.service;

import com.microservices.productservices.model.Product;
import com.microservices.productservices.repository.ProductRepository;
import dto.request.ProductRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;

    @Override
    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
        productRepository.save(product);
        log.info("PRODUCT {} IS SAVED SUCCESSFULLY", product.getId());
    }
}
