package com.example.viniciussec.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.viniciussec.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}