package resecurity.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import resecurity.entity.security.Role;

public interface RoleRepository extends MongoRepository<Role, String> {

    Role findByRole(String role);
}
