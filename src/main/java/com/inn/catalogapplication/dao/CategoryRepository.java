package com.inn.catalogapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inn.catalogapplication.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
