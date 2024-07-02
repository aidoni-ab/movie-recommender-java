package se.aidoni.movierecommender;

import java.util.List;

public class TmdbResponse {
    private List<TmdbMovie> results;

    // Getters and Setters
}

class TmdbMovie {
    private String title;
    private String releaseDate;
    private String overview;
    private double voteAverage;
    private String posterPath;

    // Getters and Setters
}