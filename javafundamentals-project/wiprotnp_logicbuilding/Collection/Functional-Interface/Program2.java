import java.util.ArrayList;
import java.util.function.Function;

public class Program2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(10);
        al.add(15);
        al.add(20);
        al.add(25);
        al.add(30);
        al.add(35);
        al.add(40);
        al.add(45);
        al.add(50);

        Function<ArrayList<Integer>, Integer> sumFunction = list -> {
            int sum = 0;
            for (int n : list)
                sum += n;
            return sum;
        };

        int total = sumFunction.apply(al);
        System.out.println("Sum of all elements: " + total);
    }
}