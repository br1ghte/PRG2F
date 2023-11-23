package ukoly;

import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int delka = sc.nextInt();

        int[] array = new int[delka];
        int suda = 0;
        int licha = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * delka);
        }
        int[] pole = {1,47,8,6,2,4,6,2,47,9,6,36,4};
        for (int i = 0; i < pole.length; i++) {
            if (i % 2 == 0) {
                suda += suda[pole];
            } else {
                licha += licha[pole];
            }
        }

    }


