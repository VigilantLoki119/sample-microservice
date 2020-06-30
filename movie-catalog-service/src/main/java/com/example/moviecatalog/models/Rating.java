package com.example.moviecatalog.models;

public class Rating {

	private String name;
	private String rating;
	
	
	public Rating(String name, String rating) {
		super();
		this.name = name;
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	
}
