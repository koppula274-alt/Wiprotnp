interface PrimeChecker {
    PrimeClass check(int n);
}

class PrimeClass {
    PrimeClass(int n) {
        boolean isPrime = true;
        if (n < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(n + " is " + (isPrime ? "Prime" : "Not Prime"));
    }
}

public class PrimeCheckDemo {
    public static void main(String[] args) {
        // Method reference to constructor
        PrimeChecker pc = PrimeClass::new;

        pc.check(17);
        pc.check(20);
    }
}