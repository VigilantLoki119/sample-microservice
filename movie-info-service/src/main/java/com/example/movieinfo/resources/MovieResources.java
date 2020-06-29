package com.example.movieinfo.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movieinfo.models.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResources {
	
	@RequestMapping("/{movieID}")
	public Movie getMovieInfo(@PathVariable("movieID") String movieID) {
		return new Movie(movieID, "Kal ho na ho");
	}
}
