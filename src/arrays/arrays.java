package arrays;

public class arrays {
    public static void main(String[] args) {
        int[] pole = {5, 32, 4 , 8};
        int[] poleJinak = new int[10];
        System.out.println(pole[2]);
        for (int i = 0; i < pole.length; i++) {
            System.out.println(pole[i]);
        }

        System.out.println("1: " + pole[1] + " 2: " + pole[2]);
        pole[2] = 10;
        for (int i = 0; i < poleJinak.length; i++) {
            poleJinak[i] = (int) (Math.random()*101);
        }
        for (int i = 0; i < poleJinak.length; i++) {
            System.out.println(poleJinak[i]);
        }
    }
}
