import java.util.Scanner;
import java.util.StringJoiner;

public class Pronlem2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        StringJoiner s1 = new StringJoiner("-");

        for (int i = 0; i < n1; i++) {
            s1.add(sc.next());
        }

        int n2 = sc.nextInt();
        StringJoiner s2 = new StringJoiner("-");

        for (int i = 0; i < n2; i++) {
            s2.add(sc.next());
        }

        // s1 merged to s2
        StringJoiner temp1 = new StringJoiner("-");
        temp1.merge(s2);
        temp1.merge(s1);
        System.out.println(temp1);

        // s2 merged to s1
        StringJoiner temp2 = new StringJoiner("-");
        temp2.merge(s1);
        temp2.merge(s2);
        System.out.println(temp2);

        sc.close();
    }
}
