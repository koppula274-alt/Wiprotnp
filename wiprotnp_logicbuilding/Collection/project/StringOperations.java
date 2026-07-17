import java.util.ArrayList;
import java.util.Scanner;

public class StringOperations {

    public void performOperations() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String S1 : ");
        String s1 = sc.nextLine();

        System.out.print("Enter String S2 : ");
        String s2 = sc.nextLine();

        ArrayList<String> result = new ArrayList<>();

        // Operation 1
        StringBuilder op1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0)
                op1.append(s2);
            else
                op1.append(s1.charAt(i));
        }
        result.add(op1.toString());

        // Operation 2
        int first = s1.indexOf(s2);
        int last = s1.lastIndexOf(s2);

        if (first != last && first != -1) {
            String rev = new StringBuilder(s2).reverse().toString();
            String temp = s1.substring(0, last) + rev
                    + s1.substring(last + s2.length());
            result.add(temp);
        } else {
            result.add(s1 + s2);
        }

        // Operation 3
        if (first != last && first != -1) {
            result.add(s1.replaceFirst(s2, ""));
        } else {
            result.add(s1);
        }

        // Operation 4
        int mid = (s2.length() % 2 == 0)
                ? s2.length() / 2
                : (s2.length() / 2) + 1;

        String firstHalf = s2.substring(0, mid);
        String secondHalf = s2.substring(mid);

        result.add(firstHalf + s1 + secondHalf);

        // Operation 5
        StringBuilder op5 = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {

            char ch = s1.charAt(i);

            if (s2.indexOf(ch) != -1)
                op5.append('*');
            else
                op5.append(ch);

        }

        result.add(op5.toString());

        System.out.println("\nOutput");

        for (int i = 0; i < result.size(); i++) {
            System.out.println((i + 1) + ". " + result.get(i));
        }

    }
}