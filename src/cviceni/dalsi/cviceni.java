package cviceni.dalsi;


import java.util.Scanner;

public class cviceni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int num = 0;
        while (true) {
            if (input == -1) {
                break;
            }
            input = sc.nextInt();
            num += input;


        }
        System.out.println("Soucet vsech cisel je: " + num);
    }
}
