package com.testProject.demo.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.testProject.demo.model.User;
import com.testProject.demo.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	private final UserRepository userRepository;
	
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}


	public void saveMyUser(User user)
	{
		userRepository.save(user);
	}
}
