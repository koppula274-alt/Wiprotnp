import java.util.Scanner;

public class MostFrequentDigit {

    public static int mostFrequentDigit(int num) {

        num = Math.abs(num);

        int[] freq = new int[10];

        if (num == 0)
            freq[0]++;

        while (num > 0) {

            int digit = num % 10;
            freq[digit]++;
            num /= 10;
        }

        int max = freq[0];
        int digit = 0;

        for (int i = 1; i < 10; i++) {

            if (freq[i] > max) {
                max = freq[i];
                digit = i;
            }

        }

        return digit;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        System.out.println("Most Frequent Digit = " + mostFrequentDigit(num));

        sc.close();
    }
}