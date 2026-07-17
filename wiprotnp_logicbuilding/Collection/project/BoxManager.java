import java.util.HashSet;
import java.util.Scanner;

public class BoxManager {

    HashSet<Box> boxes = new HashSet<>();

    public void addBoxes() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Boxes : ");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println();

            System.out.println("Enter Box " + i + " Details");

            System.out.print("Length : ");
            double length = sc.nextDouble();

            System.out.print("Width : ");
            double width = sc.nextDouble();

            System.out.print("Height : ");
            double height = sc.nextDouble();

            Box box = new Box(length, width, height);

            if (boxes.add(box))
                System.out.println("Box Added Successfully");
            else
                System.out.println("Duplicate Volume... Box Not Added");

        }

    }

    public void displayBoxes() {

        System.out.println();

        System.out.println("Unique Boxes in the Set are");

        for (Box b : boxes) {

            System.out.println(b);

        }

    }

}