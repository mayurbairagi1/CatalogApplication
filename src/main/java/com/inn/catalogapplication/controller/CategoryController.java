package com.inn.catalogapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inn.catalogapplication.model.Category;
import com.inn.catalogapplication.model.CategoryAttribute;
import com.inn.catalogapplication.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello";
	}

	@GetMapping("/getAllCategory")
	public List<Category> getAllCategory(){
		return categoryService.getAllCategory();
	}

	@GetMapping("/getCategoryById/{id}")
	public Category getCategoryById(@PathVariable("id") Integer id) {
		return categoryService.getCategoryById(id);
	}
	
	@GetMapping("/getCategoryAttributeByCategoryId/{id}")
	public CategoryAttribute getCategoryAttributeByCategoryId(@PathVariable("id") Integer id) {
		return categoryService.getCategoryAttributeByCategoryId(id);
	}

	@PostMapping("/addCategory")
	public void addCategory(@RequestBody Category category) {
		categoryService.addCategory(category);
	}

	@PutMapping("/updateCategory")
	public void updateCategory(@RequestBody Category category) {
		categoryService.updateCategory(category);
	}

	@DeleteMapping("/deleteCategory/{id}")
	public void deleteCategory(@PathVariable("id") Integer id) {
		categoryService.deleteCategory(id);
	}

}
