package com.shop.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.shop.model.Owner;
import com.shop.repository.OwnerRepository;

@Service
@Transactional
public class OwnerService {

	private final OwnerRepository ownerRepository;

	public OwnerService(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}

	public void saveOwner(Owner owner) {
		ownerRepository.save(owner);
	}
	
	public Owner findByOwnernameAndOwnerpassword(String ownername , String password)
	{
		return ownerRepository.findByOwnernameAndOwnerpassword(ownername, password);
	}

}
