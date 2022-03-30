package ru.job4j.account.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.account.entity.Account;

public interface AccountRepository extends CrudRepository<Account, Long> {



}