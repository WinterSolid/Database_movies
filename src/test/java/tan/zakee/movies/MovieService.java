package tan.zakee.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieService {

    @Autowired  // instantiate constructors for class MovieRepo...
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();


    }
}
