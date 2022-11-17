package com.bob.springbootmall.dao;

import com.bob.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
