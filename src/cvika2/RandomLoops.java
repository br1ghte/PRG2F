package cvika2;

import java.util.Scanner;

public class RandomLoops {
    public static void main(String[] args) {
        // generujte 2 (0-20) nahodna cisla, vypiste na kolikaty pokus byly shodne
        int num1 = (int) (Math.random()*21);
        int num2 = (int) (Math.random()*21);
        int tries = 1;
        System.out.println(num2 + " , " + num1);
        while (num2 != num1) {
            num1 = (int) (Math.random()*21);
            num2 = (int) (Math.random()*21);
            System.out.println(num2 + " , " + num1);
            tries++;
        }
        System.out.println("Trvalo to " + tries + "pokusu");

        //generujte 100x 2 nahodna cisla (0-20), vypiste kolikrat byly shodny
        int counter = 0;
        for (int i = 0; i < 100; i++) {
            num1 = (int) (Math.random()*21);
            num2 = (int) (Math.random()*21);
            System.out.println(num2 + " , " + num1);
            if (num1 == num2 ) {
                counter++;
            }
        }
        System.out.println("Totozne cilsa padla "  + counter + "x" );

        //vygeneruj trojuhelnik podle zadani uzvivatele, ktery zada pocet radek a system pote vygeneruje
        //potrebny pocet hvezdicek na urcitem radku
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej pocet radek");
        int levels = sc.nextInt();

        for (int i = 1; i < levels; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

