import java.util.Scanner;

public class CreatePIN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Alpha: ");
        int alpha = sc.nextInt();

        System.out.print("Enter Beta: ");
        int beta = sc.nextInt();

        System.out.print("Enter Gamma: ");
        int gamma = sc.nextInt();

        int min = Math.min(alpha, Math.min(beta, gamma));
        int max = Math.max(alpha, Math.max(beta, gamma));

        int pin = min * 1000 + max;

        System.out.println("Generated PIN = " + pin);

        sc.close();
    }
}