import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            names.add(sc.next());
        }

        StringJoiner sj = new StringJoiner(",", "{", "}");

        for (String name : names) {
            sj.add(name);
        }

        System.out.println(sj);

        sc.close();
    }
}
