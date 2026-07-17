import java.util.Scanner;

public class SecondWordUppercase {

    public static String secondWordUpper(String str) {

        String[] words = str.trim().split("\\s+");

        if (words.length < 2)
            return "Second word does not exist";

        return words[1].toUpperCase();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Sentence: ");
        String str = sc.nextLine();

        System.out.println("Second Word in Uppercase: " + secondWordUpper(str));

        sc.close();
    }
}