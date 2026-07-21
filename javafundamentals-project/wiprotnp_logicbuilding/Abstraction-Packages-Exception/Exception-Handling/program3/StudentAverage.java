import java.util.Scanner;

public class StudentAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            for (int i = 1; i <= 2; i++) {

                System.out.println("Enter Student Name:");
                String name = sc.nextLine();

                int total = 0;

                System.out.println("Enter marks in 3 subjects:");

                for (int j = 1; j <= 3; j++) {

                    int mark = Integer.parseInt(sc.nextLine());

                    if (mark < 0 || mark > 100)
                        throw new InvalidMarksException("Marks should be between 0 and 100");

                    total += mark;
                }

                System.out.println(name + " Average = " + (total / 3.0));
            }

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}