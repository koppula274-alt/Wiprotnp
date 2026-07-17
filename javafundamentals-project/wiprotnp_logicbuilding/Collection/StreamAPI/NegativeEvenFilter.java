import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NegativeEvenFilter {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(-4);
        al.add(7);
        al.add(-8);
        al.add(3);
        al.add(-2);
        al.add(10);
        al.add(-11);
        al.add(-6);
        al.add(5);
        al.add(-9);

        List<Integer> negativeEvens = al.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Negative even numbers: " + negativeEvens);
    }
}