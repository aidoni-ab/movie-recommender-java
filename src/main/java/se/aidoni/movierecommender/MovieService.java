package se.aidoni.movierecommender;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {

    @Value("${tmdb.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    public List<Movie> searchMovies(String query) {
        String url = "https://api.themoviedb.org/3/search/movie?api_key=" + apiKey + "&query=" + query;
        TmdbResponse response = restTemplate.getForObject(url, TmdbResponse.class);
        return response.getResults().stream().map(this::convertToMovie).collect(Collectors.toList());
    }

    public List<Movie> getRecommendations() {
        // Implement recommendation logic based on user ratings/preferences
        return List.of(); // Return empty list for now
    }

    private Movie convertToMovie(TmdbMovie tmdbMovie) {
        Movie movie = new Movie();
        movie.setTitle(tmdbMovie.getTitle());
        movie.setReleaseDate(tmdbMovie.getReleaseDate());
        movie.setOverview(tmdbMovie.getOverview());
        movie.setRating(tmdbMovie.getVoteAverage());
        movie.setPosterPath("https://image.tmdb.org/t/p/w500" + tmdbMovie.getPosterPath());
        return movie;
    }
}
