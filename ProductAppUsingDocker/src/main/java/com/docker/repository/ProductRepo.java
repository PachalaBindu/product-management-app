package com.docker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docker.entity.ProductEntity;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {

}
