package dat;

import dat.config.HibernateConfig;
import dat.daos.PersonDAO;
import dat.dtos.BankAccountDTO;
import dat.dtos.BankAccountWithUserDTO;
import dat.dtos.UserDTO;
import dat.entities.BankAccount;
import dat.entities.Person;
import dat.entities.User;
import jakarta.persistence.EntityManagerFactory;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        //EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory("persons");

        User user = new User(1L, "John", "Doe", "johnDoe@email.com");
        UserDTO userDTO = new UserDTO(user.getFirstName() + " " + user.getLastName(), user.getEmail());
        System.out.println(userDTO.getFullName());

        BankAccount bankAccount = new BankAccount(1L, 1L, "johnDoeAccountName", 1000.0, Date.valueOf("2024-01-01"), Date.valueOf("2021-02-02"));
        BankAccountDTO bankAccountDTO = new BankAccountDTO(bankAccount.getAccountNumber(), bankAccount.getBalance(), bankAccount.getCreatedAt());
        System.out.println(bankAccountDTO);

        BankAccountWithUserDTO bankAccountWithUserDTO = new BankAccountWithUserDTO(bankAccount.getAccountNumber(),
                bankAccount.getBalance(), user.getFirstName() + " " + user.getLastName(), user.getEmail());
        System.out.println(bankAccountWithUserDTO.getFullName() + " " + bankAccountWithUserDTO.getBalance());

    }
}