package com.realtime.search.restapi.springboot_search_rest_api.Controller;

import com.realtime.search.restapi.springboot_search_rest_api.Entity.Product;
import com.realtime.search.restapi.springboot_search_rest_api.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
//RequestMapping is used to map web requests onto a specific handles class or
// handler method
public class ProductController {

    private ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProduct(@RequestParam("query") String query){
        return ResponseEntity.ok(productService.searchProduct(query));
    }

@PostMapping
    public  Product createProduct (@RequestBody Product product){
        return productService.createProduct(product);
    }


}
