package com.acme.banking.dbo.legacy2.service;

import org.springframework.stereotype.Component;

import com.acme.banking.dbo.legacy2.domain.Account;

@Component
public class TransferService {
    
    public void transfer(Account from, Account to, double amount) {
        from.withdraw(amount);
        to.deposit(amount);
    }
}
