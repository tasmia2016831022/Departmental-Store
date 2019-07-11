package com.shop.repository;

import org.springframework.data.repository.CrudRepository;

import com.shop.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, String>{
	
	public Owner findByOwnernameAndOwnerpassword(String ownername , String password);
}
