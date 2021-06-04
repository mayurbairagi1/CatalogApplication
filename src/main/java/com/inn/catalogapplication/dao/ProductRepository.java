package com.inn.catalogapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inn.catalogapplication.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
