package tan.zakee.movies.repositoryInterfaces;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tan.zakee.movies.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
