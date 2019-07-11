package com.shop.repository;

import org.springframework.data.repository.CrudRepository;
import com.shop.model.Product;

public interface ProductRepository extends CrudRepository<Product, String>{
	
}
