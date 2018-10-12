package com.itconsortiumgh.jmsmessaging.repository;


import com.itconsortiumgh.jmsmessaging.models.Transactions;
import org.springframework.data.repository.CrudRepository;


public interface TransactionRepository extends CrudRepository<Transactions, Long> {


}
