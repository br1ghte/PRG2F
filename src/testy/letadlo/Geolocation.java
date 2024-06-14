package testy.letadlo;

public class Geolocation {
    double x;
    double y;

    public Geolocation(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {return "poloha x je: " + x +"a poloha y je: " +y;}

    public static void main(String[] args) {
    }
}
