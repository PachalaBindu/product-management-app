package com.docker.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docker.dto.Product;
import com.docker.entity.ProductEntity;
import com.docker.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepo productRepo;
	
	@Autowired
	ModelMapper modelMapper;

	@Override
	public List<Product> getAllProducts() {
		List<ProductEntity> productList = productRepo.findAll();
		List<Product> products = new ArrayList<>();
		for(ProductEntity product: productList) {
			Product productDto = modelMapper.map(product, Product.class);
			products.add(productDto);
		}
		return products;
	}

	@Override
	public Product insertProduct(Product product) {
		ProductEntity productEntity = new ProductEntity(product.getProductName(), product.getProductCost());
		productRepo.save(productEntity);
		Product productList = modelMapper.map(productEntity, Product.class);
		return productList;
	}

	@Override
	public Product getProductById(int productId) {
		ProductEntity productEntity = productRepo.findById(productId).get();
		Product product = modelMapper.map(productEntity, Product.class);
		return product;
	}

}

