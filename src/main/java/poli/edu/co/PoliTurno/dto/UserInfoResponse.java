package poli.edu.co.PoliTurno.dto;

import jakarta.validation.constraints.Email;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@Builder
public class UserInfoResponse {

    private String id;
    private String username;
    private String email;
    private List<String> roloes;
}
