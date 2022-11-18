package com.bob.springbootmall.service;

import com.bob.springbootmall.dto.ProductRequest;
import com.bob.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
