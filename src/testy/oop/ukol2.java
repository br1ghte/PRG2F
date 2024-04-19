package testy.oop;

public class ukol2 {
    int COST_PER_SQUARE_METER = 300;

    boolean farming;



    int rent(int width, int lenght, int days) {
        int cena = width * lenght * days * COST_PER_SQUARE_METER;

        if (farming && days == 183) {
            cena -= 100000;

            if (cena <= 0) {
                cena = 0;
            }
        }


        return cena;
    }

    public static void main(String[] args) {
        ukol2 p = new ukol2();
        System.out.println("Cena bud: " + p.rent(400, 500, 158));
    }

}
