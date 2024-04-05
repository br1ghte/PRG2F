package testy;

public class ukol1 {

    public static int checkPulse(int [] pulses) {
        int hodnoty = 0;
        for (int i = 0; i < pulses.length; i++) {
            for (int j = 0; j < pulses.length; j++) {
                if (pulses[i] - pulses[j] >= 30 ){
                    hodnoty += System.out.println("Danger");
                } else {
                    if (pulses[i] == 0 && pulses [j] ==0){
                        hodnoty += System.out.println("Dead");

                    } else {
                        hodnoty += System.out.println("Vse ok");
                    }
                }
            }
        }
        return hodnoty;
    }
    public static void main(String[] args) {
        int[] pulsy = {50, 20, 30, 100};
        checkPulse(pulsy);

    }
}
