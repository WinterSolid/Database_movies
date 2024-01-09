package tan.zakee.movies.serviceTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tan.zakee.movies.Movie;
import tan.zakee.movies.repositoryInterfaces.MovieRepository;
import tan.zakee.movies.services.MovieService;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class MovieServiceTest {

    @Mock
    private MovieRepository movieRepository;

    @InjectMocks
    private MovieService movieService;

    @Test
    void testAllMovies() {
        // Arrange
        List<Movie> movieList = Arrays.asList(new Movie(), new Movie());
        when(movieRepository.findAll()).thenReturn(movieList);

        // Act
        List<Movie> result = movieService.allMovies();

        // Assert
        assertEquals(movieList, result);
        verify(movieRepository, times(1)).findAll();
    }

    @Test
    void testIndividualMovie() {
        // Arrange
        String imdbId = "123";
        Movie movie = new Movie();
        Optional<Movie> optionalMovie = Optional.of(movie);
        when(movieRepository.findByImdbId(imdbId)).thenReturn(optionalMovie);

        // Act
        Optional<Movie> result = movieService.individualMovie(imdbId);

        // Assert
        assertEquals(optionalMovie, result);
        verify(movieRepository, times(1)).findByImdbId(imdbId);
    }
}
