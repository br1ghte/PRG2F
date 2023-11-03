package cviceni;

import java.util.Scanner;

public class mensivetsirovno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cislo");
        int input = 0;
        int num = (int) (Math.random()*101);
        while (input != num) {
            input = sc.nextInt();
            if (input < num) {
                System.out.println("Cislo je vetsi");
            } else if (input > num) {
                System.out.println("cislo je mensi");
            } else {
                System.out.println("Trefil ses!");
            }
        }
    }
}
