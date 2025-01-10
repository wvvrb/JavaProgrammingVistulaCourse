package com.bank;

//custom exception to handle insufficient funds
public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
