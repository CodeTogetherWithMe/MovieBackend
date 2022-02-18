package com.codewithmeinbengali.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codewithmeinbengali.movie.models.Movie;

@Repository
public interface IMovieRepository extends JpaRepository<Movie, Integer> {

}
