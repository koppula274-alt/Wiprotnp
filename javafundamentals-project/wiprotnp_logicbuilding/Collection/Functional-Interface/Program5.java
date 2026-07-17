import java.util.ArrayList;
import java.util.function.Predicate;

public class Program5 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(4);
        al.add(7);
        al.add(9);
        al.add(15);
        al.add(16);
        al.add(20);
        al.add(25);
        al.add(30);
        al.add(36);

        Predicate<Integer> isPerfectSquare = n -> {
            int sqrt = (int) Math.sqrt(n);
            return sqrt * sqrt == n;
        };

        System.out.println("Perfect square numbers:");
        for (int n : al) {
            if (isPerfectSquare.test(n)) {
                System.out.println(n);
            }
        }
    }
}