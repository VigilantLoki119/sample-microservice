package com.example.ratingsdata.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ratingsdata.models.Rating;
import com.example.ratingsdata.models.UserRatings;

@RestController
@RequestMapping("/rating")
public class RatingResource {
	
	@RequestMapping("/{ratingID}")
	public Rating getRatings(@PathVariable("ratingID") String ratingID) {
		return new Rating(ratingID, "5");
	}
	
	@RequestMapping("/users/{userId}")
	public UserRatings getRatingsFromUserId(@PathVariable("userId") String userId) {
		List<Rating> ratings = Arrays.asList(
				new Rating("abcdefg", "4"), 
				new Rating("hijklmn", "5")
		);
		UserRatings userRatings = new UserRatings();
		userRatings.setUserRatings(ratings);
		return userRatings;
	}
}
