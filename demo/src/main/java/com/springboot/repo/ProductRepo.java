package com.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprigboot.entity.Product;

public interface ProductRepo extends JpaRepository<Product , Long> {

}
