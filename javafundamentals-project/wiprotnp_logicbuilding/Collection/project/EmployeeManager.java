import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeManager {

    TreeSet<Employee> employees = new TreeSet<>();

    public void addEmployees() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Employees");

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter Employee " + i + " Details");

            System.out.print("Firstname : ");
            String fname = sc.nextLine();

            System.out.print("Lastname : ");
            String lname = sc.nextLine();

            System.out.print("Mobile : ");
            String mobile = sc.nextLine();

            System.out.print("Email : ");
            String email = sc.nextLine();

            System.out.print("Address : ");
            String address = sc.nextLine();

            employees.add(new Employee(fname, lname, mobile, email, address));

        }

    }

    public void displayEmployees() {

        System.out.println();

        System.out.format("%-15s %-15s %-15s %-30s %-15s\n",
                "Firstname", "Lastname", "Mobile", "Email", "Address");

        for (Employee e : employees)
            System.out.println(e);

    }

}