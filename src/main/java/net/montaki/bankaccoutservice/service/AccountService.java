package net.montaki.bankaccoutservice.service;

import net.montaki.bankaccoutservice.dto.BankAccountRequestDTO;
import net.montaki.bankaccoutservice.dto.BankAccountResponseDTO;

public interface AccountService {
    BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);

    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}