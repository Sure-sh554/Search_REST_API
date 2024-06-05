package com.realtime.search.restapi.springboot_search_rest_api.Service;

import com.realtime.search.restapi.springboot_search_rest_api.Entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProduct(String query);

    Product createProduct(Product product);
}
