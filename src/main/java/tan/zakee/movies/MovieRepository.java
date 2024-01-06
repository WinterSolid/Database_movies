package tan.zakee.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    //Optional List of Movie that MongoDB will inteperate to find by imdbId
    Optional<Movie> findByImdbId(String imdbId);
}
