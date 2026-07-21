import java.util.Scanner;

public class AddLastDigits {

    public static int addLastDigits(int input1, int input2) {

        int last1 = Math.abs(input1 % 10);
        int last2 = Math.abs(input2 % 10);

        return last1 + last2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int input1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int input2 = sc.nextInt();

        System.out.println("Sum of Last Digits = " + addLastDigits(input1, input2));

        sc.close();
    }
}