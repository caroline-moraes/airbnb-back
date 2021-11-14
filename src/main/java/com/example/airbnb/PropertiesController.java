package com.example.airbnb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PropertiesController {

	@Autowired
	private PropertiesRepository repository;
	
	/*@RequestMapping(value = "/{localization}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Accommodations>> getAccommodation(@PathVariable("localization") String localization) {
		List<Accommodations> accommodationList = repository.findByLocalization(localization);
		return new ResponseEntity<List<Accommodations>>(accommodationList, HttpStatus.OK);
	}*/
	@CrossOrigin
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
	public List<Properties> getAllProperties() {
			return repository.findAll();
	}
	
}