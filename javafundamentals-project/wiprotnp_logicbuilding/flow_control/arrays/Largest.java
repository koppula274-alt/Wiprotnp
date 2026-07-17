import java.util.Arrays;

public class Largest {
    public static void main(String[] args) {

        int[] arr = { 12, 45, 7, 89, 23, 56 };

        Arrays.sort(arr);

        System.out.println("Smallest numbers: " + arr[0] + " " + arr[1]);
        System.out.println("Largest numbers: " + arr[arr.length - 2] + " " + arr[arr.length - 1]);
    }
}