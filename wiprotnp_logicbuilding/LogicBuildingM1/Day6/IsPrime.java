import java.util.Scanner;

public class IsPrime {

    public static int isPrime(int num) {

        if (num <= 1)
            return 1;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return 1;
        }

        return 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if (isPrime(num) == 2)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");

        sc.close();
    }
}