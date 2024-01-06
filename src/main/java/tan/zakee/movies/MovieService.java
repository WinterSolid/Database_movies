package tan.zakee.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
