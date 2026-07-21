import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeManager employeeManager = new EmployeeManager();
        CardManager cardManager = new CardManager();
        BoxManager boxManager = new BoxManager();
        StringOperations stringOperations = new StringOperations();

        while (true) {

            System.out.println("\n========================================");
            System.out.println("      COLLECTION MINI PROJECT");
            System.out.println("========================================");
            System.out.println("1. Employee Register");
            System.out.println("2. Display Employees");
            System.out.println("3. Collect Unique Card Symbols");
            System.out.println("4. Group Cards");
            System.out.println("5. Box Collection");
            System.out.println("6. String Operations");
            System.out.println("7. Exit");
            System.out.print("Enter your choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    employeeManager.addEmployees();
                    break;

                case 2:
                    employeeManager.displayEmployees();
                    break;

                case 3:
                    cardManager.uniqueCards();
                    break;

                case 4:
                    cardManager.groupCards();
                    break;

                case 5:
                    boxManager.addBoxes();
                    boxManager.displayBoxes();
                    break;

                case 6:
                    sc.nextLine(); // Clear buffer
                    stringOperations.performOperations();
                    break;

                case 7:
                    System.out.println("\nThank You!");
                    System.out.println("Exiting Collection Mini Project...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice...Try Again.");
            }
        }
    }
}