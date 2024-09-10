package dat.dtos;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserDTO {
    private String fullName;
    private String email;

    public UserDTO(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }
}
