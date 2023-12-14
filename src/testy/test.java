package testy;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] list = new int[20];
        int soucet = 0;
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random()*100-100);
            soucet += list[i];
        }
        if (soucet < 0) {
            System.out.println("Cislo je zaporne, soucet je: " + soucet);
        } else {
            System.err.println("Cislo je kladne, soucet je: " + soucet);
        }

        int[] array = {-5,8,-3,4,11,201,9,999,55};
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= -10 && array[i] <= 10) {
                System.out.println(array[i]);
            }
        }


    }
}
