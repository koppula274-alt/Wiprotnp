import java.util.ArrayList;
import java.util.function.Predicate;

class Employee4 {
    private int id;
    private String name;
    private double salary;

    Employee4(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Program4 {
    public static void main(String[] args) {
        ArrayList<Employee4> al = new ArrayList<>();
        al.add(new Employee4(1, "Ravi", 8000));
        al.add(new Employee4(2, "Anita", 12000));
        al.add(new Employee4(3, "Suresh", 9500));
        al.add(new Employee4(4, "Kavya", 15000));
        al.add(new Employee4(5, "Manoj", 7000));

        Predicate<Employee4> lowSalary = e -> e.getSalary() < 10000;

        System.out.println("Employees with salary less than 10000:");
        for (Employee4 e : al) {
            if (lowSalary.test(e)) {
                System.out.println(e.getName());
            }
        }
    }
}