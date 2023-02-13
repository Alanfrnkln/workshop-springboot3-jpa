package com.educandoweb.course.resources;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.services.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    final CategoryService categoryService;

    public CategoryController(CategoryService CategoryService) {
        this.categoryService = CategoryService;
    }

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        return ResponseEntity.ok().body(categoryService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable("id") Long id)  {
        return ResponseEntity.ok().body(categoryService.findById(id));
    }
}
