import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Get the last n characters
        String last = str.substring(str.length() - n);

        // Repeat the last n characters n times
        String result = "";

        for (int i = 0; i < n; i++) {
            result += last;
        }

        System.out.println(result);

        sc.close();
    }
}