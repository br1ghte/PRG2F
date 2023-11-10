package arrays;

import java.util.Arrays;

public class RandomIntervals {
    public static void main(String[] args) {
        int random = (int)(Math.random()*51+50);{

            //staticky
            int [] arr = {1, 2, 3, 4, 5, 6};
            int [] array = new int[15];
            //napln array random cislama -49-50
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random()*100-49);
            }
            //vypis:
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();

            //alternative vypis:
            System.out.println(Arrays.toString(array));


            //vypis pole pozpatku
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();

            //vypis vsechna zaporna cisla v poli
            System.out.println("negative");
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0){
                    System.out.print(array[i] + "");
                }
            }
            //vypis pole zig-zag
            System.out.println("Zig-zag outpput");
            for (int i = 0; i < array.length/2; i++) {
                System.out.print(array[i] + " ");
                System.out.print(array[array.length - i - 1] + " ");
            }

        }
    }
}
