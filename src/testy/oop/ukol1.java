package testy.oop;

public class ukol1 {
        int balance;
        int debt;

    public ukol1(int balance, int debt) {
        this.balance = balance;
        this.debt = debt;
    }

    final int PRICE_PER_ROLL = 150;

        void bet(int balance, int tocky, int tocky2, int tocky3) {
        tocky = (int) (Math.random() * 7 + 1);
        tocky2 = (int) (Math.random() * 7 + 1);
        tocky3 = (int) (Math.random() * 7 + 1);
        ;

        this.balance = balance;
        if (tocky == tocky2 && tocky2 == tocky3 && this.balance >= PRICE_PER_ROLL) {
            balance -= PRICE_PER_ROLL;
            balance += 1500;
        } else {
            System.out.println("Nelze vsadit");
        }

    }
        void getBalance() {
            System.out.println("Na ucte j " + balance);
        }

        void loan(int amount) {
            balance += amount;
            debt += (int) (amount * 1.5);


        }

    public static void main(String[] args) {
            ukol1 e = new ukol1(300, 0);
            e.getBalance();
    }
}
