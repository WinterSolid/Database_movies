package tan.zakee.movies.controllerTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import tan.zakee.movies.Movie;
import tan.zakee.movies.controller.MovieController;
import tan.zakee.movies.services.MovieService;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class MovieControllerTest {

    @Mock
    private MovieService movieService;

    @InjectMocks
    private MovieController movieController;

    @Test
    void testGetAllMovies() {
        // Arrange
        List<Movie> movieList = Arrays.asList(new Movie(), new Movie());
        when(movieService.allMovies()).thenReturn(movieList);

        // Act
        ResponseEntity<List<Movie>> responseEntity = movieController.getAllMovies();

        // Assert
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(movieList, responseEntity.getBody());
        verify(movieService, times(1)).allMovies();
    }

    @Test
    void testGetIndividualMovie() {
        // Arrange
        String imdbId = "123";
        Movie movie = new Movie();
        Optional<Movie> optionalMovie = Optional.of(movie);
        when(movieService.individualMovie(imdbId)).thenReturn(optionalMovie);

        // Act
        ResponseEntity<Optional<Movie>> responseEntity = movieController.getIndividualMovie(imdbId);

        // Assert
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(optionalMovie, responseEntity.getBody());
        verify(movieService, times(1)).individualMovie(imdbId);
    }
}
