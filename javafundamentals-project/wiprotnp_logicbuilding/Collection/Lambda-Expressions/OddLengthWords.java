import java.util.ArrayList;

public class OddLengthWords {
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

        System.out.println("Words with odd length:");
        al.stream()
                .filter(word -> word.length() % 2 != 0)
                .forEach(System.out::println);
    }
}