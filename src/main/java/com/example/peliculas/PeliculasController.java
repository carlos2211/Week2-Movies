package com.example.peliculas;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/peliculas")
public class PeliculasController {

    private final PeliculasRepository repository;

    public PeliculasController(PeliculasRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Pelicula> getAllPeliculas() {
        return repository.findAll();
    }
    // http://localhost:8080/peliculas

    @GetMapping("/{id}")
    public Pelicula getPeliculaById(@PathVariable Integer id) {
        return repository.findById(id).orElse(null);
    }
     // http://localhost:8080/peliculas/5

    @PostMapping
    public Pelicula createPelicula(@RequestBody Pelicula pelicula) {
        return repository.save(pelicula);
    }
    // POST http://localhost:8080/peliculas
    //     {
    //     "title": "Resident Evil: Welcome To Raccoon City",
    //     "year": 2021,
    //     "director": "Johannes Roberts",
    //     "genre": "Horror",
    //     "synopsis": "sobrevivientes luchan contra zombies , mientras intentan descubir la verdad"
    //      }

    @PutMapping("/{id}")
    public Pelicula updatePelicula(@PathVariable Integer id, @RequestBody Pelicula pelicula) {
        pelicula.setId(id);
        return repository.save(pelicula);
    }

    // PUT http://localhost:8080/peliculas/1
    // {
    // "title": "Inception (Updated Name)",
    // "year": 2010,
    // "director": "Christopher Nolan",
    // "genre": "Sci-Fi",
    // "synopsis": "Versión actualizada de la sinopsis."
    // }

    @DeleteMapping("/{id}")
    public void deletePelicula(@PathVariable Integer id) {
        repository.deleteById(id);
    }
    // DELETE http://localhost:8080/peliculas/3
}
