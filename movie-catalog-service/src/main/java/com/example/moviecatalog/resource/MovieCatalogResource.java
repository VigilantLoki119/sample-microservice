package com.example.moviecatalog.resource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.moviecatalog.models.CatalogItem;
import com.example.moviecatalog.models.Movie;
import com.example.moviecatalog.models.Rating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
		
		List<Rating> ratings = Arrays.asList(
				new Rating("abcdefg","4"),
				new Rating("hijklmn","5")
		);
		return ratings.stream().map(rating -> {
			Movie movie = restTemplate.getForObject("http://localhost:8082/movies/"+rating.getRating(), Movie.class);
			return new CatalogItem(movie.getName(),"A movie about bots",rating.getRating());
		}).collect(Collectors.toList());
	}
}
