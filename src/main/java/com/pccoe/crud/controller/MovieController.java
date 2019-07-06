package com.pccoe.crud.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pccoe.crud.entity.Movie;
import com.pccoe.crud.repository.MovieRepository;

@RestController
public class MovieController {
	
	
	
	@Autowired
	private MovieRepository movieRepository;
	
	
	
	@GetMapping("/movie")
	public Iterable<Movie> getMovie()
	{
		
		return movieRepository.findAll();
	}

	
	@PostMapping("/movie")
	public Movie add(@RequestBody Movie movie)
	{
		return movieRepository.save(movie);
	}
	
	
	
	@PutMapping("/movie")
	public Movie updateMovie(@RequestBody Movie movie)
	{
		return movieRepository.save(movie);
	}
	
	
	@DeleteMapping("/movie/{id}")
	public void  deleteMovie(@PathVariable Long id)
	{
		movieRepository.deleteById(id);
	}
}
