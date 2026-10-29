package net.montaki.bankaccoutservice.web;


import net.montaki.bankaccoutservice.entities.BankAccount;
import net.montaki.bankaccoutservice.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BankAccountGraphQLController {

    @Autowired
    private BankAccountRepository bankAccountRepository;

    @QueryMapping
    public List<BankAccount> accountsList() {
        return bankAccountRepository.findAll();
    }
}