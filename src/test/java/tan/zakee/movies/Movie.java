package tan.zakee.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

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

@Document(collation = "movies") //this will represent each document collection class.
@Data //@Data: Takes care of all get set and toString methods
@AllArgsConstructor // constructor, that the below as a private field as arguments.
@NoArgsConstructor // constructor that takes NO params.

public class Movie {
    @Id
    private ObjectId id;// Will be the unique identifier.
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference // will store ids but data will be stored in separate collection.
    private List<Reviews> reviewId;


}
