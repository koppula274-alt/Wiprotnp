import java.util.Scanner;

public class NthPrime {

    public static boolean isPrime(int num) {

        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static int nthPrime(int n) {

        int count = 0;
        int number = 1;

        while (count < n) {

            number++;

            if (isPrime(number))
                count++;
        }

        return number;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.println(n + "th Prime Number = " + nthPrime(n));

        sc.close();
    }
}