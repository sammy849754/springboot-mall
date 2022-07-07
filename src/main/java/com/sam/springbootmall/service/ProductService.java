package com.sam.springbootmall.service;

import com.sam.springbootmall.dto.ProductRequest;
import com.sam.springbootmall.model.Product;

public interface ProductService {

    Product getProductId(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
