import java.util.ArrayList;
import java.util.function.Predicate;

public class Program3 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("madam");
        al.add("hello");
        al.add("level");
        al.add("world");
        al.add("noon");
        al.add("java");
        al.add("civic");
        al.add("code");
        al.add("refer");
        al.add("stack");

        Predicate<String> isPalindrome = word -> {
            String reversed = new StringBuilder(word).reverse().toString();
            return word.equals(reversed);
        };

        System.out.println("Palindrome words:");
        for (String word : al) {
            if (isPalindrome.test(word)) {
                System.out.println(word);
            }
        }
    }
}