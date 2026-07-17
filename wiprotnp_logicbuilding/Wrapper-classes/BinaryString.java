import java.util.Scanner;

public class BinaryString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-255): ");
        int n = sc.nextInt();

        if (n < 1 || n > 255) {
            System.out.println("Invalid input");
            return;
        }

        String binary = Integer.toBinaryString(n);

        // Pad with leading zeros to make 8 bits
        binary = String.format("%8s", binary).replace(' ', '0');

        System.out.println("Binary representation: " + binary);

        sc.close();
    }
}