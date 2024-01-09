package tan.zakee.movies.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tan.zakee.movies.Movie;
import tan.zakee.movies.repositoryInterfaces.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired  // instantiate constructors for class MovieRepo...
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> individualMovie(String imdbId) {
        return movieRepository.findByImdbId(imdbId);
    }
}
