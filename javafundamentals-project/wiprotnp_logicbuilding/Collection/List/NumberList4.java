import java.util.ArrayList;

public class NumberList4 {

    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();

        list.add(100);
        list.add(25.5);
        list.add(45.78f);
        list.add(9999999999L);

        for (Number n : list)
            System.out.println(n);

    }
}