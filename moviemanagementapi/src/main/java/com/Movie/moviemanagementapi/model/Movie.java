package com.Movie.moviemanagementapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "movies")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL AUTO_INCREMENT
    private Long id;

    @NotBlank(message = "title is required")
    private String title;

    private String director;

    @Min(value = 1888, message = "releaseYear must be >= 1888")
    private Integer releaseYear;

    private String genre;

    @NotNull(message = "rating is required")
    @Min(value = 1, message = "rating must be between 1 and 10")
    @Max(value = 10, message = "rating must be between 1 and 10")
    private Integer rating;
}
