package com.example.airbnb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Properties {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String description;
	private String location;
	private double price;
	private String host;
	private boolean reserved;
	
	protected Properties() {}
	
	public Properties(String name, String description, String location, double price, String host, boolean reserved) {
	    this.name = name;
	    this.description = description;
	    this.location = location;
	    this.price = price;
	    this.host = host;
	    this.reserved = reserved;
    }
	
	public boolean isReserved() {
		return reserved;
	}

	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}

	@Override
	public String toString() {
		return String.format("Accommodation[id=%d, name='%s', description='%s', location='%s', price='%f', host='%s']", id, name, description, location, price, host);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocalization() {
		return location;
	}

	public void setLocalization(String location) {
		this.location = location;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
	
}
