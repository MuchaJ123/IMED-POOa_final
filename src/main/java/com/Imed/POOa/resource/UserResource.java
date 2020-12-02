package com.Imed.POOa.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Imed.POOa.domain.User;
import com.Imed.POOa.dto.UserDTO;
import com.Imed.POOa.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
 @Autowired
 private UserService service ;
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<UserDTO>> finAll(){
		List<User> list = service.findAll();
		List<UserDTO> listdto = list.stream().map(l -> new UserDTO(l)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listdto); 
	} 
	
	
}
