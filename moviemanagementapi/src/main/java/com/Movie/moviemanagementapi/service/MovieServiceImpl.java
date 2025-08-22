package com.Movie.moviemanagementapi.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.Movie.moviemanagementapi.exception.ResourceNotFoundException;
import com.Movie.moviemanagementapi.model.Movie;
import com.Movie.moviemanagementapi.repository.MovieRepository;


@Service
public class MovieServiceImpl implements MovieService {


private final MovieRepository repository;


public MovieServiceImpl(MovieRepository repository) {
this.repository = repository;
}


@Override
public Page<Movie> getAllMovies(Pageable pageable) {
return repository.findAll(pageable);
}


@Override
public Movie getMovieById(String id) {
return repository.findById(id)
.orElseThrow(() -> new ResourceNotFoundException("Movie not found: " + id));
}


@Override
public Movie createMovie(Movie movie) {
// ID will be generated; validation handled by annotations
return repository.save(movie);
}


public Movie updateMovie(String id, Movie updated) {
    Movie existing = repository.findById(id)
                               .orElseThrow(() -> new RuntimeException("Movie not found"));

    existing.setTitle(updated.getTitle());
    existing.setDirector(updated.getDirector());
    existing.setReleaseYear(updated.getReleaseYear());
    existing.setGenre(updated.getGenre());
    existing.setRating(updated.getRating());

    return repository.save(existing);
}


@Override
public void deleteMovie(String id) {
if (!repository.existsById(id)) {
throw new ResourceNotFoundException("Movie not found: " + id);
}
repository.deleteById(id);
}
}