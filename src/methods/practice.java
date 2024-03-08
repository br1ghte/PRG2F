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
        //String time;
        //int hours = seconds / 3600;
        //int remainingSeconds = seconds - hours * 3600;
        //int min = remainingSeconds / 60;
        //int sec = remainingSeconds % 60;

        // allternative
        // sec = seconds - (min*60)

        //jeste jinak
        int hours = seconds / 3600;
        int min = (seconds % 3600) / 60;
        int sec = seconds % 60;
        return hours + ":" + min + ":" + sec;
    }
    
    static int dieRolls(int diceAmount, int value) {
        int sum = 0;
        for (int i = 0; i < diceAmount; i++) {
            sum = (int) (Math.random() * value + 1);

        }
        return sum;
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
        System.out.println(minuteConvert(3845));
    }
}
