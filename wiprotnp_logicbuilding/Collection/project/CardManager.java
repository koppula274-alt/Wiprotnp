import java.util.*;

public class CardManager {

    // Assignment 1 - Unique Symbols
    public void uniqueCards() {

        Scanner sc = new Scanner(System.in);

        HashSet<Character> symbolSet = new HashSet<>();
        LinkedHashMap<Character, Card> firstCards = new LinkedHashMap<>();

        int count = 0;

        while (symbolSet.size() < 4) {

            System.out.println("Enter a card :");

            char symbol = sc.next().charAt(0);
            int number = sc.nextInt();

            count++;

            if (!symbolSet.contains(symbol)) {
                symbolSet.add(symbol);
                firstCards.put(symbol, new Card(symbol, number));
            }
        }

        System.out.println("\nFour symbols gathered in " + count + " cards.");

        System.out.println("Cards in Set are :");

        TreeMap<Character, Card> sorted = new TreeMap<>(firstCards);

        for (Card c : sorted.values()) {
            System.out.println(c);
        }
    }

    // Assignment 2 - Group Cards
    public void groupCards() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Cards : ");

        int n = sc.nextInt();

        TreeMap<Character, ArrayList<Card>> map = new TreeMap<>();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter card " + i + " :");

            char symbol = sc.next().charAt(0);
            int number = sc.nextInt();

            Card card = new Card(symbol, number);

            if (!map.containsKey(symbol))
                map.put(symbol, new ArrayList<Card>());

            map.get(symbol).add(card);
        }

        System.out.println();

        System.out.print("Distinct Symbols are : ");

        for (char ch : map.keySet())
            System.out.print(ch + " ");

        System.out.println("\n");

        for (char ch : map.keySet()) {

            ArrayList<Card> list = map.get(ch);

            int sum = 0;

            System.out.println("Cards in " + ch + " Symbol");

            for (Card c : list) {

                System.out.println(c);

                sum += c.getNumber();
            }

            System.out.println("Number of cards : " + list.size());

            System.out.println("Sum of Numbers : " + sum);

            System.out.println();
        }

    }

}