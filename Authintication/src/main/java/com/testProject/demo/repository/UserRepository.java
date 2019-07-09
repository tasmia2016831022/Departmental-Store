package com.testProject.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.testProject.demo.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
