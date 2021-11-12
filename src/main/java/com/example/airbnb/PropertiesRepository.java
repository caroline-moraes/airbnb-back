package com.example.airbnb;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PropertiesRepository extends CrudRepository<Properties, Long> {

	List<Properties> findAll();
	List<Properties> findByLocalization(String localization);
	
}
