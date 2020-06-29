package com.example.moviecatalog.models;

public class CatalogItem {

	private String name;
	private String description;
	private float rating;
	
	public CatalogItem() {
		super();
	}

	public CatalogItem(String name, String description, float rating) {
		super();
		this.name = name;
		this.description = description;
		this.rating = rating;
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
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
}
