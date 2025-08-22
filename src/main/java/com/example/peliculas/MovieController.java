package com.example.peliculas;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")

public class MovieController {

    private List<Movie> movies = new ArrayList<>();

    public MovieController() {
        movies.add(new Movie(1, "Inception", 2010, "Christopher Nolan", "Sci-Fi",
                "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a CEO."));
        movies.add(new Movie(2, "The Godfather", 1972, "Francis Ford Coppola", "Crime",
                "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son."));
        movies.add(new Movie(3, "Pulp Fiction", 1994, "Quentin Tarantino", "Crime",
                "The lives of two mob hitmen, a boxer, a gangster's wife, and a pair of diner bandits intertwine in four tales of violence and redemption."));
        movies.add(new Movie(4, "The Shawshank Redemption", 1994, "Frank Darabont", "Drama",
                "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency."));
        movies.add(new Movie(5, "The Dark Knight", 2008, "Christopher Nolan", "Action",
                "When the menace known as the Joker wreaks havoc and chaos on Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice."));

    }

    // Get All movies
    @GetMapping
    public List<Movie> getAll() {
        return movies;
    }

    // Get movie by ID
    @GetMapping("/{id}")
    public Movie obtenerPorId(@PathVariable int id) {
        return movies.stream()
                .filter(juego -> juego.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
