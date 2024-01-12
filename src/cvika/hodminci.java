package cvika;

public class hodminci {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        for (int i = 0; i < 100; i++) {
            int num = (int) (Math.random()*100+1);
            if (num % 2 == 1) {
                heads ++;
            } else {
                tails++;
            }
        }
        if (heads > tails) {
            System.out.println("Vyhraly heads a padly: " + heads + " x");
        } else {
            System.out.println("Vyhraly tails a padly: " + tails + " x");
        }
    }
}
