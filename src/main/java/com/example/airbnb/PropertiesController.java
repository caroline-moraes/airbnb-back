package com.example.airbnb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")
public class PropertiesController {

	@Autowired
	private PropertiesRepository repository;
	
	@RequestMapping(value = "/all/location", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Properties>> getPropertiesLocation(@PathVariable("location") String location) {
		List<Properties> propertiesList = repository.findByLocation(location);
		return new ResponseEntity<List<Properties>>(propertiesList, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
	public List<Properties> getAllProperties() {
			return repository.findAll();
	}
	
	@RequestMapping(value = "details-host/{hostName}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Properties>> getProperties(@PathVariable("hostName") String host) {
		List<Properties> propObj = repository.findByHost(host);
		if(host == null) {
			return new ResponseEntity<List<Properties>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Properties>>(propObj, HttpStatus.OK);
	}	
	
	/*GET propriedade por id*/
	@RequestMapping(value = "/all/{id}", method = RequestMethod.GET, produces = "application/json")
	public Properties getAllPropertiesId(@PathVariable("id") long id) {
			return repository.findById(id);
	}
	
	@PutMapping
	public Properties putProperty(Properties property) {
		repository.save(property);
		return property;
	}
	
	
	@RequestMapping(value = "/all", method = RequestMethod.POST)
	public Properties newProperty(@RequestBody Properties newProperty) {
	    return repository.save(newProperty);
	}
	
	@RequestMapping(value = "/all/{id}", method = RequestMethod.DELETE)
	public void deleteProperty(@PathVariable("id") long id) {
	    repository.deleteById(id);
	}

}