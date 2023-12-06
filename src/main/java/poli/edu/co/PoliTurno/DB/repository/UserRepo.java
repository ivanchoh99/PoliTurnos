package poli.edu.co.PoliTurno.DB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import poli.edu.co.PoliTurno.DB.entity.User;

@Repository
public interface UserRepo extends MongoRepository<User, String> {

    User findByUsername(String username);

    Boolean existsByEmail(String email);

    Boolean existsByUsername(String username);
}
