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

import com.inn.catalogapplication.model.Product;
import com.inn.catalogapplication.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/getAllProduct")
	public List<Product> getAllProduct(){
		return productService.getAllProduct();
	}

	@GetMapping("/getProductById/{id}")
	public Product getProductById(@PathVariable("id") Integer id) {
		return productService.getProductById(id);
	}

	@PostMapping("/addProduct")
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}

	@PutMapping("/updateProduct")
	public void updateProduct(@RequestBody Product product) {
		productService.updateProduct(product);
	}

	@DeleteMapping("/deleteProduct/{id}")
	public void deleteProduct(@PathVariable("id") Integer id) {
		productService.deleteProduct(id);
	}

}
