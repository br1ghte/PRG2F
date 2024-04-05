package testy;

import java.util.ArrayList;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
         int[][] pole = {
                 {30,20,60,11},
                 {10,15,25,12},
                 {25,14,62,45}
         };

         int sum = 0;

         for (int i = 0; i < pole.length; i++) {
             System.out.println(pole[i]);
             sum += pole[i][sum];
             if (sum >= 100) {
                 System.out.println("Zak 1 prosel");
             }
         }

        int[][] nejmensi = {
                {1, 2, 4, 4},
                {4, 5, 6, 7},
                {7, 8, 9, 1},
                {2, 3, 4, 5}
        };

     //  int sum1 = 0;

     //  Scanner sc = new Scanner(System.in);
     //  int input = sc.nextInt();
     //  for (int i = 0; i < nejmensi.length; i++) {
     //      System.out.println(nejmensi[i][input]);
     //      if (sum1 < nejmensi[i][input]) {
     //          sum += nejmensi[i][input];
     //      }
     //  }
     //  System.out.println("Nejmensi cislo v sloupci " + input + " je:" + sum1);

     //  ArrayList<Integer> listofstrings = new ArrayList<>();
     //  int input1 = sc.nextInt();
     //  if (input1 == "konec" || "Konec") {
     //      break;
     //  }
     //  for (int i = 0; i < listofstrings.size(); i++) {
     //      if (listofstrings.size() == 8) {
     //          System.out.println(listofstrings);
     //      }
     //  }


    }
}
