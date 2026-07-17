import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int empNo;
    String name;
    int age;
    String location;

    Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public String toString() {
        return "EmpNo: " + empNo + ", Name: " + name + ", Age: " + age + ", Location: " + location;
    }
}

public class EmployeeFilter {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee(101, "Ravi", 28, "Pune"));
        al.add(new Employee(102, "Anita", 32, "Mumbai"));
        al.add(new Employee(103, "Suresh", 25, "Pune"));
        al.add(new Employee(104, "Kavya", 30, "Chennai"));
        al.add(new Employee(105, "Manoj", 27, "Pune"));

        List<Employee> puneEmployees = al.stream()
                .filter(e -> e.location.equals("Pune"))
                .collect(Collectors.toList());

        System.out.println("Employees in Pune:");
        puneEmployees.forEach(System.out::println);
    }
}