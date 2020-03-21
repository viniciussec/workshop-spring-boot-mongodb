package com.example.viniciussec.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.viniciussec.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
	
	
	
	
}
