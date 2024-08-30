package org.example;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

import java.text.ParseException;

public class Program {
    public static void main(String[] args) throws ParseException {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingAccount(1004, "Ana", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount)acc2;
        //BusinessAccount acc5 = (BusinessAccount)acc3;

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingAccount) {
            SavingAccount acc5 = (SavingAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }


    }
}