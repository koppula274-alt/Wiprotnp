import java.io.*;
import java.util.Date;

public class EmployeeDemo {

    public static void main(String[] args) {

        try {

            // Create Employee object
            Employee emp = new Employee(
                    "Nagamani",
                    new Date(),
                    "CSE",
                    "Software Engineer",
                    50000);

            // Serialization
            FileOutputStream fos = new FileOutputStream("data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(emp);

            oos.close();
            fos.close();

            System.out.println("Employee object serialized successfully.");

            // Deserialization
            FileInputStream fis = new FileInputStream("data");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee e = (Employee) ois.readObject();

            ois.close();
            fis.close();

            // Display Employee details
            System.out.println("\nEmployee Details");
            System.out.println("-------------------------");
            System.out.println("Name        : " + e.getName());
            System.out.println("Date of Birth : " + e.getDateOfBirth());
            System.out.println("Department  : " + e.getDepartment());
            System.out.println("Designation : " + e.getDesignation());
            System.out.println("Salary      : " + e.getSalary());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}