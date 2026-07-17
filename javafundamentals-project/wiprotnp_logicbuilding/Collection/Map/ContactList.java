import java.util.*;

public class ContactList {

    public static void main(String[] args) {

        HashMap<String, Integer> contacts = new HashMap<>();

        contacts.put("Ravi", 987654321);
        contacts.put("Priya", 987654322);
        contacts.put("Rahul", 987654323);

        System.out.println("Key Exists : " +
                contacts.containsKey("Ravi"));

        System.out.println("Value Exists : " +
                contacts.containsValue(987654321));

        Iterator<Map.Entry<String, Integer>> it = contacts.entrySet().iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}