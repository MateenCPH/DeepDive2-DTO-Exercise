package dat.dtos;

import lombok.*;

@Data
@ToString
public class PersonDTO {
    private String firstName;
    private String lastName;

    public PersonDTO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
