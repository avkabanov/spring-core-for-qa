package com.acme.banking.dbo.legacy2.domain;

/**
 * @author Алексей
 * @date 13.05.2019
 */
public interface Account {

    void withdraw(double amount);

    void deposit(double amount);

    long getId();

    double getAmount();
    
    String getType();
}
