import java.util.Scanner;

public class PalindromePossible {

    public static boolean isPalindromePossible(int n) {

        n = Math.abs(n);

        int[] freq = new int[10];

        while (n > 0) {
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }

        int oddCount = 0;

        for (int i = 0; i < 10; i++) {
            if (freq[i] % 2 != 0)
                oddCount++;
        }

        return oddCount <= 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if (isPalindromePossible(n))
            System.out.println("Palindrome is Possible");
        else
            System.out.println("Palindrome is Not Possible");

        sc.close();
    }
}