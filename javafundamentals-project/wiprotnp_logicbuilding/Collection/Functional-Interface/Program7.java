import java.util.ArrayList;
import java.util.function.Consumer;

public class Program7 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
        al.add(10);

        Consumer<Integer> checkOddEven = n -> {
            if (n % 2 == 0) {
                System.out.println(n + " even");
            } else {
                System.out.println(n + " odd");
            }
        };

        al.forEach(checkOddEven);
    }
}