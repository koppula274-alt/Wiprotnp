public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        db.addEmployee(new Employee(101, "Ravi",
                "ravi@gmail.com", "Male", 35000));

        db.addEmployee(new Employee(102, "Priya",
                "priya@gmail.com", "Female", 42000));

        db.display();

        System.out.println();

        System.out.println(db.showPaySlip(101));

        db.deleteEmployee(102);

        System.out.println("\nAfter Deletion:");

        db.display();

    }
}