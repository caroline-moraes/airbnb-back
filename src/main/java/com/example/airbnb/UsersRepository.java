package com.example.airbnb;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, Long> {

	List<Users> findAll();
	Users findByName(String name);
	Users findById(long id);
}
