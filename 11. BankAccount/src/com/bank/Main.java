package com.bank;

public class Main {
    public static void main(String[] args) {
        //creating an Account object with initial data
        Account account = new Account("John Doe", 500, "123456789");

        try {
            //attempting to make a transfer that exceeds the current balance
            account.transfer(600);
        } catch (NotEnoughMoneyException e) {
            //handling the custom exception when the transfer amount exceeds balance
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            //handling any other exceptions that may occur
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            //displaying the current account balance after the attempted transfer
            System.out.println("Current balance: " + account.getBalance());
        }
    }
}

