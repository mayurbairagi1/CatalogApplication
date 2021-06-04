package com.inn.catalogapplication.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inn.catalogapplication.dao.ProductRepository;
import com.inn.catalogapplication.model.Product;
import com.inn.catalogapplication.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{


	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Integer id) {
		Optional<Product> product = productRepository.findById(id);
		return product.get();
	}

	@Override
	public void addProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public void updateProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public void deleteProduct(Integer id) {
		productRepository.deleteById(id);
	}
}
