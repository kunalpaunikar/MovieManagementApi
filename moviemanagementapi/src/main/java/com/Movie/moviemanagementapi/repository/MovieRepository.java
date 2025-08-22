package com.Movie.moviemanagementapi.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.Movie.moviemanagementapi.model.Movie;


public interface MovieRepository extends JpaRepository<Movie, String> { }
