package com.codewithmeinbengali.movie.service;

import java.util.List;

import com.codewithmeinbengali.movie.models.Movie;

public interface IMovieService {

	Movie addMovie(Movie movie);

	List<Movie> getAllMovies();

	Movie getMovieById(int id);

	Movie updateMovieById(int id, Movie movie);

	void deleteMovieById(int id);


}
