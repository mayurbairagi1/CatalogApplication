package com.inn.catalogapplication.service;

import java.util.List;

import com.inn.catalogapplication.model.Product;

public interface ProductService {

	List<Product> getAllProduct();

	Product getProductById(Integer id);

	void addProduct(Product product);

	void updateProduct(Product product);

	void deleteProduct(Integer id);

}
