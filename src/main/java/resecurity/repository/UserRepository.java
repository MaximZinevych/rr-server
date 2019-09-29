package resecurity.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import resecurity.entity.security.User;

public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);
}
