package dat.dtos;

import lombok.Data;
import lombok.ToString;

@Data
@ToString

public class BankAccountWithUserDTO {
    private String accountNumber;
    private double balance;
    private String fullName;
    private String email;

    public BankAccountWithUserDTO(String accountNumber, double balance, String fullName, String email) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.fullName = fullName;
        this.email = email;
    }
}
