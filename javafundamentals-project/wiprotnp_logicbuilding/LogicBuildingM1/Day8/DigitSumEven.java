import java.util.Scanner;

public class DigitSumEven {

    public static int digitSumEven(int n) {

        n = Math.abs(n);
        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            if (digit % 2 == 0)
                sum += digit;

            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        System.out.println("Sum of Even Digits = " + digitSumEven(n));

        sc.close();
    }
}