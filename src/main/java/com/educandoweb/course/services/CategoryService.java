package com.educandoweb.course.services;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository orderRepository) {
        this.categoryRepository = orderRepository;
    }

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        return categoryRepository.findById(id).get();
    }
}
