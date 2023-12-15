package teststrings;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] krestniJmena = {"Jenda", "Karel", "Matej", "Igor"};
        String[] prijmeni = {"Mach", "Robertson", "Hinduk", "Mares"};
        String random = "";
        for (int i = 0; i < krestniJmena.length; i++) {

        }
        System.out.println(random);

        String vety = "Dneska jsem mel rizek. Mel jsem dneska rizek? Ty hajzle!";
        int pocet = 0;

        for (int i = 0; i < vety.length(); i++) {
            if (vety.charAt(i) == '.' || vety.charAt(i) == '!' || vety.charAt(i) == '?') {
                pocet += 1;
            }
        }
        System.out.println(pocet);

        System.out.println("zadej telefonni cislo");
        String input = sc.nextLine();
        if (input.charAt(0) == '+') {
            System.out.println("+ je spravne");
        }
        if (input.charAt(1) == '4') {
            System.out.println("4 je spravne");
        }
        if (input.charAt(2) == '2') {
            System.out.println("2 je spravne");
        }
        if (input.charAt(3) == '0') {
            System.out.println("0 je spravne");
        }
        if (input.length() == 13){
            System.out.println("delka cisla OK");
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                System.out.println("Zadej cislo bez mezer");
                break;
            }
        }
    }
}
