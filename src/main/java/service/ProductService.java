package service;

import model.Product;
import org.springframework.stereotype.Service;
import repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;


    public List<Product> getProductByCategoryID(int categoryID){
        return productRepository.findByCategoryID(categoryID);
    }
    public List<Product> getProductByProductNamerContainingIgnoreCase(String productName){
        return productRepository.findByProductNamerContainingIgnoreCase(productName);
    }


}
