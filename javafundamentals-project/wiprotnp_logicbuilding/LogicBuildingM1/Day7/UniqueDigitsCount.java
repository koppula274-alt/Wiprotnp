import java.util.Scanner;

public class UniqueDigitsCount {

    public static int uniqueCount(int n) {

        n = Math.abs(n);

        boolean[] visited = new boolean[10];

        int count = 0;

        if (n == 0)
            return 1;

        while (n > 0) {

            int digit = n % 10;

            if (!visited[digit]) {

                visited[digit] = true;
                count++;

            }

            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        System.out.println("Unique Digits = " + uniqueCount(n));

        sc.close();
    }
}