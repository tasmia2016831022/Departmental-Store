package com.shop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.shop.model.Product;
import com.shop.model.Supplier;
import com.shop.repository.ProductRepository;
import com.shop.repository.SupplierRepository;

@Service
@Transactional
public class SupplierService {
	private final SupplierRepository supplierRepository;

	public SupplierService(SupplierRepository supplierRepository) {
		this.supplierRepository = supplierRepository;
	}

	public void saveSupplier(Supplier supplier)
	{
		supplierRepository.save(supplier);
	}
	
	public List<Supplier> showAllSupplier()
	{
		List<Supplier>suppliers = new ArrayList<Supplier>();
		for(Supplier supplier :supplierRepository.findAll())
		{
			suppliers.add(supplier);
		}
		return suppliers;
	}
	
	public void deleteSupplier(String supplierphone)
	{
		supplierRepository.deleteById(supplierphone);
	}


	public Optional<Supplier> editSupplier(String supplierphone) {
		
	  return supplierRepository.findById(supplierphone);
	}
}
