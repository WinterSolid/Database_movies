package tan.zakee.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "reviews") //this will represent each document collection class.
@Data //@Data: Takes care of all get set and toString methods
@AllArgsConstructor // constructor, that the below as a private field as arguments.
@NoArgsConstructor // constructor that takes NO params.

public class Review {
    @Id
    private ObjectId id;
    private String body;


    public Review(String body) {
        this.body = body;
    }
}
