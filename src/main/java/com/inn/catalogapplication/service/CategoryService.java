package com.inn.catalogapplication.service;

import java.util.List;

import com.inn.catalogapplication.model.Category;
import com.inn.catalogapplication.model.CategoryAttribute;

public interface CategoryService {

	List<Category> getAllCategory();

	Category getCategoryById(Integer id);

	void addCategory(Category category);

	void updateCategory(Category category);

	void deleteCategory(Integer id);

	CategoryAttribute getCategoryAttributeByCategoryId(Integer id);

}
