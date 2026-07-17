import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo3 {

    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();

        set.add("India");
        set.add("USA");
        set.add("Japan");
        set.add("Australia");
        set.add("Germany");

        System.out.println("Original TreeSet:");
        System.out.println(set);

        System.out.println("\nReverse Order:");
        System.out.println(set.descendingSet());

        System.out.println("\nUsing Iterator:");

        Iterator<String> it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nElement Exists?");
        System.out.println("India : " + set.contains("India"));
        System.out.println("China : " + set.contains("China"));
    }
}