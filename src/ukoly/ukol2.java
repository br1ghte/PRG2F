package ukoly;

import java.util.ArrayList;
import java.util.Scanner;

public class ukol2 {
    public static void main(String[] args) {
        //2D pole, uzivatel voli cislo sloupce a vypise sumu
        int[][] celacisla = {
                {7,6,9,5,7},
                {7,6,7,5,7},
                {8,6,9,4,7},
                {7,6,9,5,7},
                {7,6,9,4,7}
        };
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < celacisla.length; i++) {
            System.out.println(celacisla[i][input]);
            sum += celacisla[i][input];
        }

        System.out.println("Soucet sloupce " + input + " je: " + sum);

        ArrayList<String> lisrOfStrings = new ArrayList<>();
        lisrOfStrings.add("Hello"); // vkladani
        lisrOfStrings.get(0); // vybrani prvku na indexu 0
        lisrOfStrings.contains("Hello"); // jestli obsahuje 'hello'
        lisrOfStrings.size(); // velikost pole << ekvivalent pole.length
    }
}
