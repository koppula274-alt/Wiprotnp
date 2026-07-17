import java.util.Scanner;

public class DigitSumOption {

    public static int digitSum(int n, int option) {

        n = Math.abs(n);
        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            if (option == 1) {
                if (digit % 2 == 0)
                    sum += digit;
            } else if (option == 2) {
                if (digit % 2 != 0)
                    sum += digit;
            }

            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        System.out.println("1. Sum of Even Digits");
        System.out.println("2. Sum of Odd Digits");
        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();

        if (choice == 1)
            System.out.println("Sum of Even Digits = " + digitSum(n, choice));
        else if (choice == 2)
            System.out.println("Sum of Odd Digits = " + digitSum(n, choice));
        else
            System.out.println("Invalid Choice");

        sc.close();
    }
}