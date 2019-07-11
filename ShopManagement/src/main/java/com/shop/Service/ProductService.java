package com.shop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.shop.model.Product;
import com.shop.repository.ProductRepository;

@Service
@Transactional
public class ProductService {
	
	private final ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	

	public void saveProduct(Product product)
	{
		productRepository.save(product);
	}
	
	public List<Product> showAllProduct()
	{
		List<Product>products = new ArrayList<Product>();
		for(Product product :productRepository.findAll())
		{
			products.add(product);
		}
		return products;
	}
	
	public void deleteProduct(String productid)
	{
		productRepository.deleteById(productid);
	}


	public Optional<Product> editProduct(String productid) {
		
	  return productRepository.findById(productid);
	}
	

}
