package tan.zakee.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
/* EndPoints in MongoDB:
 * _id
 * imdbId
 * title
 * releaseDate
 * trailerLink
 * genres
 * poster
 * backdrops
 */

// Let FrameWK know that this will represent each document collection class.
@Document(collation = "movies")
public class Movie {
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;


}
