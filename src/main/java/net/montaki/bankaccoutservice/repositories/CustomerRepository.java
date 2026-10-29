package net.montaki.bankaccoutservice.repositories;

import net.montaki.bankaccoutservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}