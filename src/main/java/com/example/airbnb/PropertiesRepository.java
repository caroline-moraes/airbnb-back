package com.example.airbnb;

import java.util.List;
//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

public interface PropertiesRepository extends JpaRepository<Properties, Long> {

	List<Properties> findAll();
	List<Properties> findByHost(String host);
	List<Properties> findByLocation(String location);
	Properties findById(long id);
	
}
