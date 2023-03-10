package com.roycheng.springbootmall.dao;


import com.roycheng.springbootmall.dto.ProductQueryParams;
import com.roycheng.springbootmall.dto.ProductRequest;
import com.roycheng.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
