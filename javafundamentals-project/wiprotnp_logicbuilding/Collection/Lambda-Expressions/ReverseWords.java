import java.util.ArrayList;

public class ReverseWords {
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

        System.out.println("Words in reverse order:");
        // Using lambda with IntStream to iterate in reverse
        java.util.stream.IntStream.range(0, al.size())
                .mapToObj(i -> al.get(al.size() - 1 - i))
                .forEach(System.out::println);
    }
}