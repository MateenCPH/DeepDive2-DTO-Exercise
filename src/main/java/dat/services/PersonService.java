package dat.services;

import dat.dtos.PersonDTO;
import dat.entities.Person;

import java.time.LocalDate;

public class PersonService {
    public PersonDTO showPerson() {
        Person person = new Person(1L, "John", "Doe", LocalDate.of(1990, 10, 10), 123456789);
        return new PersonDTO(person.getFirstName(), person.getLastName());
    }

    public static void main(String[] args) {
        PersonService personService = new PersonService();
        System.out.println(personService.showPerson());
    }
}
