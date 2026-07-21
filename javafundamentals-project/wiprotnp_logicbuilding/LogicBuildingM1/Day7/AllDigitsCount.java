import java.util.Scanner;

public class AllDigitsCount {

    public static int countDigits(int n) {

        n = Math.abs(n);

        if (n == 0)
            return 1;

        int count = 0;

        while (n > 0) {

            count++;
            n /= 10;

        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        System.out.println("Total Digits = " + countDigits(n));

        sc.close();
    }
}