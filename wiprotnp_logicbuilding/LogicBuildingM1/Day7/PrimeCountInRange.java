import java.util.Scanner;

public class PrimeCountInRange {

    public static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Starting Number: ");
        int start = sc.nextInt();

        System.out.print("Enter Ending Number: ");
        int end = sc.nextInt();

        int count = 0;

        for (int i = start; i <= end; i++) {

            if (isPrime(i))
                count++;
        }

        System.out.println("Number of Prime Numbers = " + count);

        sc.close();
    }
}