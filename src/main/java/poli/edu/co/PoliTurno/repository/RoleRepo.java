package poli.edu.co.PoliTurno.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import poli.edu.co.PoliTurno.entity.ERole;
import poli.edu.co.PoliTurno.entity.Role;

import java.util.Optional;

@Repository
public interface RoleRepo extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
