package com.example.airbnb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")
public class UsersController {
	
	@Autowired
	private UsersRepository repository;
	
	@RequestMapping(value = "/allUsers", method = RequestMethod.GET, produces = "application/json")
	public List<Users> getAllUsers() {
			return repository.findAll();
	}
	
	/*GET usuário por id*/
	@RequestMapping(value = "/allUsers/{id}", method = RequestMethod.GET, produces = "application/json")
	public Users getAllUsersId(@PathVariable("id") long id) {
			return repository.findById(id);
	}
	
	@RequestMapping(value = "/allUsers", method = RequestMethod.POST)
	public Users create(@RequestBody Users user){
	   return repository.save(user);
	}

}
