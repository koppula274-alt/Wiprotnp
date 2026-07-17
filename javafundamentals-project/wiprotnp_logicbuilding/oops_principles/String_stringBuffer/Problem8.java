import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '*') {
                i++;
            } else if (i > 0 && str.charAt(i - 1) == '*') {
                continue;
            } else if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
                continue;
            } else {
                result += str.charAt(i);
            }
        }

        System.out.println(result);

        sc.close();
    }
}