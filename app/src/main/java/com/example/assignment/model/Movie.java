package com.example.assignment.model;

public class Movie {
    String movietitle;
    String movierating;
    String moviedescription;


    public Movie(String movietitle, String movierating, String moviedescription) {
        this.movietitle = movietitle;
        this.movierating = movierating;
        this.moviedescription = moviedescription;
    }

    public String getMovietitle() {
        return movietitle;
    }

    public void setMovietitle(String movietitle) {
        this.movietitle = movietitle;
    }

    public String getMovierating() {
        return movierating;
    }

    public void setMovierating(String movierating) {
        this.movierating = movierating;
    }

    public String getMoviedescription() {
        return moviedescription;
    }

    public void setMoviedescription(String moviedescription) {
        this.moviedescription = moviedescription;
    }
}
