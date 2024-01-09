package tan.zakee.movies.repositoryInterfaces;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tan.zakee.movies.Movie;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    //Optional List of Movie that MongoDB will inteperate to find by imdbId
    Optional<Movie> findByImdbId(String imdbId);
}
