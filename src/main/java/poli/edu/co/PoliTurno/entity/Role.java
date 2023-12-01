package poli.edu.co.PoliTurno.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "roles")
public class Role {

    @Id
    private Long id;
    private ERole name;
}
