package com.inn.catalogapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inn.catalogapplication.model.CategoryAttribute;

@Repository
public interface CategoryAttributeRepository extends JpaRepository<CategoryAttribute, Integer>{
	
}
