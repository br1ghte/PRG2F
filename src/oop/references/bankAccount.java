package oop.references;

import oop.BankAccount;

public class bankAccount {
    double balance;
    long bankID;
    person owner;

    public bankAccount(double balance, long bankID, person owner) {
        this.balance = balance;
        this.bankID = bankID;
        this.owner = owner;
    }

    void deposit(double amount) {
        balance += amount;
    }

    boolean withdraw (double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        System.out.println("Uzivatel" + owner.name + " nemohl vybrat castku");
        return false;
    }

    boolean transaction(double amount, bankAccount other){
        if (withdraw(amount)){
            other.deposit(amount);
            return true;
        }
        System.out.println("Nebyl mozny prevod");
        return false;
    }

    public static void main(String[] args) {
        person p1 = new person("Karel", "Praha");
        person p2 = new person("Franta", "Plzen");

        bankAccount acc1 = new bankAccount(20000, 1184645, p1);
        bankAccount acc2 = new bankAccount(20001, 1184646, p2);

        acc1.withdraw(20000);
        if (acc1.transaction(5000, acc1)){
            System.out.println("Uzivatel " + acc1.owner.name + " prevedl penize uzivateli " + acc2.owner.name);
        }
    }

}
