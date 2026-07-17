import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;

public class PrimeNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 25; i++) {
            al.add(rand.nextInt(100) + 1); // random numbers 1-100
        }

        System.out.println("Generated numbers: " + al);

        Predicate<Integer> isPrime = n -> {
            if (n < 2)
                return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        };

        System.out.println("Prime numbers:");
        al.forEach(n -> {
            if (isPrime.test(n))
                System.out.println(n);
        });
    }
}