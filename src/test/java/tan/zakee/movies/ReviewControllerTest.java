package tan.zakee.movies;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ReviewControllerTest {

    @Mock
    private ReviewService reviewService;

    @InjectMocks
    private ReviewController reviewController;

    @Test
    void testCreateReview() {
        // Arrange
        Map<String, String> payload = new HashMap<>();
        payload.put("reviewBody", "Great movie!");
        payload.put("imdbId", "123");

        Review createdReview = new Review();
        when(reviewService.createReview("Great movie!", "123")).thenReturn(createdReview);

        // Act
        ResponseEntity<Review> responseEntity = reviewController.createReview(payload);

        // Assert
        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
        assertEquals(createdReview, responseEntity.getBody());
        verify(reviewService, times(1)).createReview("Great movie!", "123");
    }
}
