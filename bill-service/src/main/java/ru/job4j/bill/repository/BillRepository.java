package ru.job4j.bill.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.bill.entity.Bill;

public interface BillRepository extends CrudRepository<Bill, Long> {



}