import java.util.Scanner;

public class PalindromeNumber {

    public static boolean isPalindrome(int n) {

        int original = Math.abs(n);
        int temp = original;
        int reverse = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        if (isPalindrome(n))
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");

        sc.close();
    }
}