package com.Movie.moviemanagementapi.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.Movie.moviemanagementapi.model.Movie;


public interface MovieService {
Page<Movie> getAllMovies(Pageable pageable);
Movie getMovieById(String id);
Movie createMovie(Movie movie);
Movie updateMovie(String id, Movie movie);
void deleteMovie(String id);
}
