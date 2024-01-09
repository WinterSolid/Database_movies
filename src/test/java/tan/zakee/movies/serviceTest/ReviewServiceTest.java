package tan.zakee.movies.serviceTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

//@ExtendWith(MockitoExtension.class)
//class ReviewServiceTest {
//
//    @Mock
//    private ReviewRepository reviewRepository;
//
//    @Mock
//    private MongoTemplate mongoTemplate;
//
//    @InjectMocks
//    private ReviewService reviewService;
//
//    @Test
//    void testCreateReview() {
//        // Arrange
//        String reviewBody = "Great movie!";
//        String imdbId = "123";
//
//        Review review = new Review(reviewBody);
//        when(reviewRepository.insert(any(Review.class))).thenReturn(review);
//
//        // Act
//        Review createdReview = reviewService.createReview(reviewBody, imdbId);
//
//        // Assert
//        assertNotNull(createdReview);
//        verify(reviewRepository, times(1)).insert(any(Review.class));
//        verify(mongoTemplate, times(1)).update(eq(Movie.class))
//                .matching(any(Criteria.class))
//                .apply(any(Update.class)).first();
//    }
//}
