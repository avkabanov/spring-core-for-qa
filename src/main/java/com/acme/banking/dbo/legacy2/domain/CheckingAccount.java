package com.acme.banking.dbo.legacy2.domain;

/**
 * @author Алексей
 * @date 13.05.2019
 */
public class CheckingAccount extends SavingAccount {

    public double overdraft;

    public CheckingAccount(long id, double amount) {
        super(id, amount);
    }

    @Override
    protected void validate(double amount) {
    }

    @Override
    public String getType() {
        return "C";
    }
}
