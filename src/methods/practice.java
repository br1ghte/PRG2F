package methods;

import java.util.ArrayList;
import java.util.Arrays;

public class practice {

    public static void greeting(String name) {
        System.out.println("Hello " + name);
        System.out.println("Have a nice day " + name);
    }

    public static int randomNumber(int min, int max){
        return (int) (Math.random() * (max - min +1) + min);
    }

    public static int rectangleArea (int width, int height) {
        return width * height;

    }

    //time convert
    public static String minuteConvert(int seconds){
        String time;
        int min;
        int sec;

        return time;
    }

    public static int[] randomArray(int lenght, int min, int max){
        int[] array = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            array[i] = randomNumber(min, max);
        }
        return array;
    }

    public static void main(String[] args) {
        greeting("Carl");
        greeting("Simonne");
        int area = rectangleArea(4, 5);
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(randomArray(10, 50, 100)));
        }

    }
}
