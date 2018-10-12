package com.itconsortiumgh.jmsmessaging.service;


import com.itconsortiumgh.jmsmessaging.models.Transactions;
import com.itconsortiumgh.jmsmessaging.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionrepository;

   /* public void saveTransaction(Transactions transaction)
        {
            transactionrepository.save(transaction);
        }
        */

    @JmsListener(destination = "OrderTransactionQueue", containerFactory = "myFactory")
    public void receiveMessage(Transactions transaction) {
        System.out.println("Received <" + transaction + ">");
        transactionrepository.save(transaction);
    }


}

