package cviceni;

import java.util.Scanner;

public class cviceni4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = 0;
        int pocet = 0;
        for (int i = 0; i < 100000; i++) {
            random = (int) (Math.random()*100);
            if (random == 42) {
                pocet = pocet + 1;
            }
        }
        System.out.println("42 se opakovalo " + pocet + "x");
    }
}
