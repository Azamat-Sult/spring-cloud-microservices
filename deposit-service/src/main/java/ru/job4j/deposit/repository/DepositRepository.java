package ru.job4j.deposit.repository;

import ru.job4j.deposit.entity.Deposit;
import org.springframework.data.repository.CrudRepository;

public interface DepositRepository extends CrudRepository<Deposit, Long> {



}