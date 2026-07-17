import java.util.Optional;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class InvalidEmployeeException extends Exception {
    InvalidEmployeeException(String message) {
        super(message);
    }
}

public class Problem3 {

    public static void main(String[] args) {

        Employee emp = null;

        try {
            Employee employee = Optional.ofNullable(emp)
                    .orElseThrow(() -> new InvalidEmployeeException("Invalid Employee"));

            System.out.println(employee.name);

        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}