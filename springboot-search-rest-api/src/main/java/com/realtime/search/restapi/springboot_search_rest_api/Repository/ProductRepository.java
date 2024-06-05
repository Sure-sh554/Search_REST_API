package com.realtime.search.restapi.springboot_search_rest_api.Repository;

import com.realtime.search.restapi.springboot_search_rest_api.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query("SELECT p FROM Product p WHERE "+"p.name LIKE CONCAT('%',:query,'%')"+
            "Or p.description LIKE CONCAT ('%',:query,'%')")
    List<Product> searchProducts(String query);
    @Query(value = "SELECT * FROM Products p WHERE "+"p.name LIKE CONCAT ('%',:query,'%')" +
            "Or p.description LIKE CONCAT ('%',:query,'%')",nativeQuery = true)
    List<Product> searchProductSQL(String query);
}
