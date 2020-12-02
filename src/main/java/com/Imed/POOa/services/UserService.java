package com.Imed.POOa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Imed.POOa.domain.User;
import com.Imed.POOa.dto.UserDTO;
import com.Imed.POOa.repository.UserRepository;
import com.Imed.POOa.services.exceptio.ObjectNotFoundException;

@Service
public class UserService {
   
	@Autowired
	private UserRepository repo;
	public List<User> findAll(){
		return repo.findAll();
	}


public User fromDTO (UserDTO objDTO) {
	return new User(objDTO.getId(),objDTO.getNome(),objDTO.getEmail());
}

public User findById (String id) {
	User user = repo.findOne(id);
	if (user == null ) {
		throw  new ObjectNotFoundException("Objecto nao encontraado");
		
	}
	return user;
}
 public User insert(User obj ) {
	 return repo.insert(obj );
 }
}

