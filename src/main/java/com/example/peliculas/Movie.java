package com.example.peliculas;

public class Movie {
    private int id;
    private String title;
    private int year;
    private String director;    
    private String genre;
    private String synopsis;

    public Movie(int id, String title, int year, String director, String genre, String synopsis) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.director = director;
        this.genre = genre;
        this.synopsis = synopsis;
    }

    public int getId() {return id;}
    public String getTitle() {return title;}
    public int getYear() {return year;}
    public String getDirector() {return director;}
    public String getGenre() {return genre;}
    public String getSynopsis() {return synopsis;}
}
