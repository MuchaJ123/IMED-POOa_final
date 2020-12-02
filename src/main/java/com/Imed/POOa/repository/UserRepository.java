package com.Imed.POOa.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Imed.POOa.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String >{

}
