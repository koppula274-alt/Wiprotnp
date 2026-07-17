import java.util.Scanner;

public class WeightOfString {

    public static int stringWeight(String str) {

        int weight = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z')
                weight += (ch - 'a' + 1);

        }

        return weight;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.println("Weight of String = " + stringWeight(str));

        sc.close();
    }
}