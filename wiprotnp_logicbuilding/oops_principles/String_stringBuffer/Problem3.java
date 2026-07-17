import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.next();

        String firstTwo = str.substring(0, 2);
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result = result + firstTwo;
        }

        System.out.println(result);

        sc.close();
    }
}