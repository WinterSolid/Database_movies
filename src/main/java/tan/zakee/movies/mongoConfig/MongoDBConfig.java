package tan.zakee.movies.mongoConfig;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoDBConfig {

    @Bean
    public MongoClient mongoClient() {
        // Configure your MongoClient connection details here
        return MongoClients.create("mongodb://localhost:8080");
    }
}
