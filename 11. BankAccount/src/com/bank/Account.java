package com.bank;

//account class to represent a bank account
public class Account {
    private String owner;
    private int balance; //balance of the account
    private String accountNumber;

    //constructor initializing all the fields
    public Account(String owner, int balance, String accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    //getter and setter methods
    public String getOwner() { return owner; }
    public void setOwner(String owner) { this.owner = owner; }
    public int getBalance() { return balance; }
    public void setBalance(int balance) { this.balance = balance; }
    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    //method to simulate a transfer
    public void transfer(int amount) throws NotEnoughMoneyException {
        if (amount > balance) {
            throw new NotEnoughMoneyException("Transfer amount exceeds available balance.");
        }
        balance -= amount;
    }
}
