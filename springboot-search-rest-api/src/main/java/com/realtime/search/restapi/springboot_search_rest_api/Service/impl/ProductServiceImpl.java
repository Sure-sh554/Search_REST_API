package com.realtime.search.restapi.springboot_search_rest_api.Service.impl;

import com.realtime.search.restapi.springboot_search_rest_api.Entity.Product;
import com.realtime.search.restapi.springboot_search_rest_api.Repository.ProductRepository;
import com.realtime.search.restapi.springboot_search_rest_api.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;
    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProduct(String query) {
        List<Product> products=productRepository.searchProducts(query);
        return products;

    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
