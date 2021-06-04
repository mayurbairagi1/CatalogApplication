package com.inn.catalogapplication.service;

import java.util.List;

import com.inn.catalogapplication.model.CategoryAttribute;

public interface CategoryAttributeService {

	List<CategoryAttribute> getAllCategoryAttribute();

	CategoryAttribute getCategoryAttributeById(Integer id);

	void addCategoryAttribute(CategoryAttribute categoryAttribute);

	void updateCategoryAttribute(CategoryAttribute categoryAttribute);

	void deleteCategoryAttribute(Integer id);

}
