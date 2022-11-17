package com.bob.springbootmall.service.impl;

import com.bob.springbootmall.dao.ProductDao;
import com.bob.springbootmall.model.Product;
import com.bob.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
