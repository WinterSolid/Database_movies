package tan.zakee.movies.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tan.zakee.movies.Movie;
import tan.zakee.movies.services.MovieService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")

public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }
    @GetMapping("/{imdbId}")
    // @PathVariable ObjectId id, will convert /{id} -> ObjectId
    public ResponseEntity<Optional<Movie>> getIndividualMovie(@PathVariable String imdbId) {
        return new ResponseEntity<Optional<Movie>>(movieService.individualMovie(imdbId),HttpStatus.OK);
    }
}
