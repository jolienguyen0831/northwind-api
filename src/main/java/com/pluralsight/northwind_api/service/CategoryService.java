package com.pluralsight.northwind_api.service;

import com.pluralsight.northwind_api.model.Category;
import com.pluralsight.northwind_api.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;


    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    public Optional<Category> getCategoryByID(Integer Id){
        return categoryRepository.findById(Id);
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public boolean deleteCategory(int id) {
        if (!categoryRepository.existsById(id)) {
            return false;
        }
        categoryRepository.deleteById(id);
        return true;
    }

    public List<Category> getCategoryByDescription(String description){
        return categoryRepository.findByDescriptionContainingIgnoreCase(description);
    }


}
