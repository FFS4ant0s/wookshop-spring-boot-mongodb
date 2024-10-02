package com.nelioalves.workshopmongo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.nelioalves.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}