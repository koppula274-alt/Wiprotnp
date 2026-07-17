import java.util.ArrayList;
import java.util.function.Consumer;

public class Program6 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("apple");
        al.add("banana");
        al.add("cat");
        al.add("dog");
        al.add("elephant");
        al.add("fox");
        al.add("goat");
        al.add("hen");
        al.add("ink");
        al.add("jug");

        Consumer<Integer> reverseAtIndex = i -> {
            String reversed = new StringBuilder(al.get(i)).reverse().toString();
            al.set(i, reversed);
        };

        for (int i = 0; i < al.size(); i++) {
            reverseAtIndex.accept(i);
        }

        System.out.println("Updated ArrayList: " + al);
    }
}