package com.pluralsight.northwind_api.service;

import com.pluralsight.northwind_api.model.Product;
import org.springframework.stereotype.Service;
import com.pluralsight.northwind_api.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

//    public List<Product> getAllProducts() {
//        return productRepository.findAll();
//    }

    public Optional<Product> getProductById(Integer id) {
        return productRepository.findById(id);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }


    public List<Product> getProductByCategoryID(int categoryID){
        return productRepository.findByCategoryID(categoryID);
    }
    public List<Product> getProductByProductNameContainingIgnoreCase(String productName){
        return productRepository.findByProductNameContainingIgnoreCase(productName);
    }
    public List<Product> getAllProducts() {
        return productRepository.findAllWithCategory();
    }


}
