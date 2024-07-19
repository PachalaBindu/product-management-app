package com.docker.service;

import java.util.List;

import com.docker.dto.Product;

public interface ProductService {
	
	List<Product> getAllProducts();
	Product insertProduct(Product product);
	Product getProductById(int productId);

}
