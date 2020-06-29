package com.example.ratingsdata.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ratingsdata.models.Rating;

@RestController
@RequestMapping("/rating")
public class RatingResource {
	
	@RequestMapping("/{ratingID}")
	public Rating getRatings(@PathVariable("ratingID") String ratingID) {
		return new Rating(ratingID, "5");
	}
}
