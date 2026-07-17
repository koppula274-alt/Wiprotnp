import java.util.Scanner;

public class ExactMultiple {

    public static int isExactMultiple(int n, int m) {

        if (m == 0)
            return 1; // Division by zero is not allowed

        if (n % m == 0)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.print("Enter M: ");
        int m = sc.nextInt();

        int result = isExactMultiple(n, m);

        if (result == 2)
            System.out.println("N is an Exact Multiple of M");
        else
            System.out.println("N is NOT an Exact Multiple of M");

        sc.close();
    }
}