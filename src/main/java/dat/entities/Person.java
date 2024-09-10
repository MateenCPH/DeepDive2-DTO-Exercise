package dat.entities;

import jakarta.persistence.*;
import jdk.jfr.TransitionFrom;
import lombok.*;

import java.security.PrivateKey;
import java.time.LocalDate;

@Entity
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String FirstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "birth_date", nullable = false)
    private LocalDate dateOfBirth;
    @Column(name = "social_security_number", nullable = false)
    private int socialSecurityNumber;

}
