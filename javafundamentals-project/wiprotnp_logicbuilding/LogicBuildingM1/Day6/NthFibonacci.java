import java.util.Scanner;

public class NthFibonacci {

    public static int fibonacci(int n) {

        if (n == 1)
            return 0;

        if (n == 2)
            return 1;

        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 3; i <= n; i++) {

            c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.println(n + "th Fibonacci Number = " + fibonacci(n));

        sc.close();
    }
}