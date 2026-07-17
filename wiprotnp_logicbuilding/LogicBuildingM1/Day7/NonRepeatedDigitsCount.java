import java.util.Scanner;

public class NonRepeatedDigitsCount {

    public static int countNonRepeated(int n) {

        n = Math.abs(n);

        int[] frequency = new int[10];

        if (n == 0)
            frequency[0]++;

        while (n > 0) {

            int digit = n % 10;

            frequency[digit]++;

            n /= 10;
        }

        int count = 0;

        for (int i = 0; i < 10; i++) {

            if (frequency[i] == 1)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        System.out.println("Non-Repeated Digits = " + countNonRepeated(n));

        sc.close();
    }
}