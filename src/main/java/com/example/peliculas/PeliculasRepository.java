package com.example.peliculas;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculasRepository extends JpaRepository<Pelicula, Integer> {
}
