package testy.letadlo;

public class TravelPlan {
    Geolocation start;
    double destination;
    Plane plane;

    public TravelPlan(double start, double destination, Plane plane) {
        this.start = start;
        this.destination = destination;
        this.plane = plane;
    }

    public double vzdalenost() {
        Geolocation startxy = new Geolocation(51.157,21.153);
        Geolocation destxy = new Geolocation(61.158,40.152);
        double vysledek = Math.sqrt(Math.pow(startxy.x - startxy.y, destxy.x - destxy.y));

        return vysledek;
    }

    public double doba() {
        int time = 0;
        time += plane.velocity / vzdalenost();
    }


    public static void getPlan(){
        System.out.println("cesta od: " +);
    }



    public static void main(String[] args) {

        Plane plane1 = new Plane("Boeing 911", 835);
        System.out.println("Vzdalenost je: " + );
    }
}
