package com.acme.banking.dbo.legacy2.domain;

public class SavingAccount implements Account {
    public long id;
    public double amount;

    public SavingAccount(long id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    @Override
    public void withdraw(double amount) {
        validate(amount);
        this.amount -= amount;
    }

    protected void validate(double amount) {
        if (amount > this.amount) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void deposit(double amount) {
        this.amount += amount;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String getType() {
        return "S";
    }
}
