package testy;

import java.util.Scanner;

public class ukol3 {

    static int oploceni(int metry, boolean lak) {
        int celacena = metry * 3 * 33;
        if (lak = true) {
            celacena = (int) (celacena * 0.23);
        }
        return celacena;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        oploceni(10, true);
        System.out.println(oploceni(10, true));

    }
}
