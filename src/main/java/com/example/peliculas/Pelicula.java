package com.example.peliculas;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "PELICULAS") 
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "peliculas_seq")
    @SequenceGenerator(name = "peliculas_seq", sequenceName = "PELICULAS_SEQ", allocationSize = 1)
    private Integer id;

    @Column(name = "TITLE", nullable = false, length = 100)
    private String title;

    @Column(name = "YEAR")
    private Integer year;

    @Column(name = "DIRECTOR", length = 100)
    private String director;

    @Column(name = "GENRE", length = 50)
    private String genre;

    @Column(name = "SYNOPSIS", length = 500)
    private String synopsis;
}
