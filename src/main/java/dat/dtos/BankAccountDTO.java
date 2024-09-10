package dat.dtos;

import dat.entities.BankAccount;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString

public class BankAccountDTO {
    private String accountNumber;
    private double balance;
    private Date createdAt;

    public BankAccountDTO(String accountNumber, double balance, Date createdAt) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.createdAt = createdAt;
    }
}
