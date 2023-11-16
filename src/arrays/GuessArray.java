package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class GuessArray {
    public static void main(String[] args) {
        //vytvort poloe o velikosti 6
        //neplnit nahodnymi cisly 1-15
        //uzivatele se 7x zeútate, aby uhodl cislo v poli
        //u uzivatele se sleduje skore
        //pri spravnem tipu se pricte skore 100
        Scanner sc = new Scanner(System.in);
        int[] guessarray = new int [6];
        int score = 0;
        int guess;

        for (int i = 0; i < guessarray.length; i++) {
            guessarray[i] = (int) (Math.random()*15+1);
        }
        //cheat
        System.out.println(Arrays.toString(guessarray));

        //ptam se 7x
        for (int i = 0; i < 7; i++) {
            System.out.println("Tipni cislo");
            guess = sc.nextInt();

            if (guess < 0 || guess > 15){
                continue;
            }

            //hledam jestli je cislo v poli
            for (int j = 0; j < guessarray.length; j++) {
                if (guess == guessarray[j]) {
                    score += 100;
                    System.out.println("uhadl jsi");
                    guessarray[j] = -1;
                    System.out.println(Arrays.toString(guessarray));
                }
            }
            //uz uhddl vse
            if (score >= guessarray.length * 100) {
                break
            }

        }
        System.out.println("game over, score " + score);

    }
}
