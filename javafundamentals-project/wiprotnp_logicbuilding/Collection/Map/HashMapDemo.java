import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("India", "Delhi");
        map.put("Japan", "Tokyo");
        map.put("USA", "Washington");

        System.out.println("Key Exists : " +
                map.containsKey("India"));

        System.out.println("Value Exists : " +
                map.containsValue("Tokyo"));

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}