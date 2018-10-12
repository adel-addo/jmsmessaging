package com.itconsortiumgh.jmsmessaging.controller;


import com.itconsortiumgh.jmsmessaging.models.Transactions;
import com.itconsortiumgh.jmsmessaging.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
    @Autowired
    private JmsTemplate jmsTemplate;
    @Autowired
    TransactionService transactionservice;


    @PostMapping("/send")
    public void send(@RequestBody Transactions transaction) {
        System.out.println("Sending a transaction.");
        jmsTemplate.convertAndSend(
                "OrderTransactionQueue", transaction);
    }


}
