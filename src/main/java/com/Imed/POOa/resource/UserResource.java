package com.Imed.POOa.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Imed.POOa.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> finAll(){
		User j = new User("1", "Jordan ", "Mucha.J@hotmail.com") ;
		User a = new User("2", "Augusto ", "Augusto@hotmail.com") ;
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(j,a));
		return ResponseEntity.ok().body(list); 
	} 
}
