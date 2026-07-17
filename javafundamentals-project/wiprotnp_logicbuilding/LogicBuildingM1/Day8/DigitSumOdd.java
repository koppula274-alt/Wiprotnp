import java.util.Scanner;

public class DigitSumOdd {

    public static int digitSumOdd(int n) {

        n = Math.abs(n);
        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            if (digit % 2 != 0)
                sum += digit;

            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        System.out.println("Sum of Odd Digits = " + digitSumOdd(n));

        sc.close();
    }
}