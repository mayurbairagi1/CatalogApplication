package com.inn.catalogapplication.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inn.catalogapplication.dao.CategoryRepository;
import com.inn.catalogapplication.model.Category;
import com.inn.catalogapplication.model.CategoryAttribute;
import com.inn.catalogapplication.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Category> getAllCategory() {
		return categoryRepository.findAll();
	}

	@Override
	public Category getCategoryById(Integer id) {
		Optional<Category> category = categoryRepository.findById(id);
		return category.get();
	}
	
	@Override
	public CategoryAttribute getCategoryAttributeByCategoryId(Integer id) {
		Optional<Category> category = categoryRepository.findById(id);
		return category.get().getCategoryAttribute();
	}

	@Override
	public void addCategory(Category category) {
		categoryRepository.save(category);
	}

	@Override
	public void updateCategory(Category category) {
		categoryRepository.save(category);
	}

	@Override
	public void deleteCategory(Integer id) {
		categoryRepository.deleteById(id);
	}


}
