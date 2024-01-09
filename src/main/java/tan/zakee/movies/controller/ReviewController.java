package tan.zakee.movies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tan.zakee.movies.Review;
import tan.zakee.movies.services.ReviewService;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/movies")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload) {
        // Extracting reviewBody and imdbId from the payload
        String reviewBody = payload.get("reviewBody");
        String imdbId = payload.get("imdbId");

        // Creating a new Review using the ReviewService
        Review createdReview = reviewService.createReview(reviewBody, imdbId);

        // Returning a ResponseEntity with the createdReview and HttpStatus.CREATED
        return new ResponseEntity<>(createdReview, HttpStatus.CREATED);
    }
}
