package net.montaki.bankaccoutservice.entities;


import net.montaki.bankaccoutservice.enums.AccountType;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = BankAccount.class, name = "p1")
public interface AccountProjection {
    public String getId();
    public AccountType getType();
    public String getBalance();
}