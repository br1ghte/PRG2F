package methods;

public class recursivePractice {

    static void doSomething(){
        System.out.println("Doing something....");
        doSomething();
    }


    static void saharaCountdown(int n) {
        System.out.println("Sahara speck #" + n);
        if (n == Integer.MAX_VALUE) {
            return;
        }
        saharaCountdown(n+1);
    }

    static int recursiveFactorial(int n){
        if (n <= 1) {
            return 1;
        }
        return n * recursiveFactorial(n-1);
    }

    static int factorial(int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result*(n-i);
        }
        return result;
    }


    public static void main(String[] args) {
    //  doSomething();
    //  saharaCountdown(1);
        System.out.println(factorial(5));
        System.out.println(recursiveFactorial(6));
    }
}
