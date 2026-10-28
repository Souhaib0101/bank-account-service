package net.montaki.bankaccoutservice.repositories;

import net.montaki.bankaccoutservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}