import java.util.Arrays;

public class Sortedarray {
    public static void main(String[] args) {

        int[] arr = { 45, 12, 89, 23, 7 };

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}