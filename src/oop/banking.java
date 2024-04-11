package oop;

public class banking {
    public static void main(String[] args) {
        BankAccount pepa = new BankAccount();
        pepa.balance = 5000;
        pepa.owner = "Pepa";
        pepa.printBalance();
        pepa.deposit(5500.50);
        pepa.printBalance();

        pepa.withdraw(2000);
        pepa.withdraw(99999);

        BankAccount fanda = new BankAccount();
        fanda.owner = "fANDA";
        fanda.balance = 1234;
        fanda.printBalance();

    }
}
