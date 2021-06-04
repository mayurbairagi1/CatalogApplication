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

import com.inn.catalogapplication.model.CategoryAttribute;
import com.inn.catalogapplication.service.CategoryAttributeService;

@RestController
@RequestMapping("/categoryAttribute")
public class CategoryAttributeController {

	@Autowired
	private CategoryAttributeService categoryAttributeService;

	@GetMapping("/getAllCategoryAttribute")
	public List<CategoryAttribute> getAllCategoryAttribute(){
		return categoryAttributeService.getAllCategoryAttribute();
	}

	@GetMapping("/getCategoryAttributeById/{id}")
	public CategoryAttribute getCategoryAttributeById(@PathVariable("id") Integer id) {
		return categoryAttributeService.getCategoryAttributeById(id);
	}

	@PostMapping("/addCategoryAttribute")
	public void addCategoryAttribute(@RequestBody CategoryAttribute categoryAttribute) {
		categoryAttributeService.addCategoryAttribute(categoryAttribute);
	}

	@PutMapping("/updateCategoryAttribute")
	public void updateCategoryAttribute(@RequestBody CategoryAttribute categoryAttribute) {
		categoryAttributeService.updateCategoryAttribute(categoryAttribute);
	}

	@DeleteMapping("/deleteCategoryAttribute/{id}")
	public void deleteCategoryAttribute(@PathVariable("id") Integer id) {
		categoryAttributeService.deleteCategoryAttribute(id);
	}
}
