package com.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.docker.dto.Product;
import com.docker.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return service.getAllProducts();
	}
	
	@GetMapping("/products/{productId}")
	public Product getProduct(@PathVariable(value = "productId", required = false) int productId) {
		return service.getProductById(productId);
	}
	
	@PostMapping("/product")
	public Product insertProduct(@RequestBody Product product){
		return service.insertProduct(product);
	}

}
