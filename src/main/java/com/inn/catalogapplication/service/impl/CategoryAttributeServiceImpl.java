package com.inn.catalogapplication.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inn.catalogapplication.dao.CategoryAttributeRepository;
import com.inn.catalogapplication.model.CategoryAttribute;
import com.inn.catalogapplication.service.CategoryAttributeService;

@Service
public class CategoryAttributeServiceImpl implements CategoryAttributeService{

	@Autowired
	private CategoryAttributeRepository categoryAttributeRepository;

	@Override
	public List<CategoryAttribute> getAllCategoryAttribute() {
		return categoryAttributeRepository.findAll();
	}

	@Override
	public CategoryAttribute getCategoryAttributeById(Integer id) {
		Optional<CategoryAttribute> categoryAttribute = categoryAttributeRepository.findById(id);
		return categoryAttribute.get();
	}

	@Override
	public void addCategoryAttribute(CategoryAttribute categoryAttribute) {
		categoryAttributeRepository.save(categoryAttribute);
	}

	@Override
	public void updateCategoryAttribute(CategoryAttribute categoryAttribute) {
		categoryAttributeRepository.save(categoryAttribute);
	}

	@Override
	public void deleteCategoryAttribute(Integer id) {
		categoryAttributeRepository.deleteById(id);
	}

}
