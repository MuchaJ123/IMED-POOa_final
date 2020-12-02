package com.Imed.POOa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Imed.POOa.domain.User;
import com.Imed.POOa.repository.UserRepository;

@Service
public class UserService {
   
	@Autowired
	private UserRepository repo;
	public List<User> findAll(){
		return repo.findAll();
		
	}
}
