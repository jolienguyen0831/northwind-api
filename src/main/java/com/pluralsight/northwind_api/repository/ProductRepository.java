package com.pluralsight.northwind_api.repository;

import com.pluralsight.northwind_api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
        List<Product> findByCategoryID(int categoryID);
        List<Product> findByProductNameContainingIgnoreCase(String productName);
}
