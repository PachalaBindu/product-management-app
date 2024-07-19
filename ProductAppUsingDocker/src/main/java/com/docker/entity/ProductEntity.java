package com.docker.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="productdb")
public class ProductEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int productId;
	
	@Column(name="productName")
	private String productName;
	
	@Column(name="productCost")
	private double productCost;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductCost() {
		return productCost;
	}

	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}
	
	public ProductEntity() {}
	
	public ProductEntity(int productId, String productName, double productCost) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
	}

	public ProductEntity(String productName, double productCost) {
		super();
		this.productName=productName;
		this.productCost=productCost;
	}

}
