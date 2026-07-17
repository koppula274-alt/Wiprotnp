import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Employee1 {
    int id;
    String name;
    String location;
    double salary;

    Employee1(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}

public class Program1 {
    public static void main(String[] args) {
        ArrayList<Employee1> al = new ArrayList<>();
        al.add(new Employee1(1, "Ravi", "Pune", 25000));
        al.add(new Employee1(2, "Anita", "Mumbai", 30000));
        al.add(new Employee1(3, "Suresh", "Pune", 18000));
        al.add(new Employee1(4, "Kavya", "Chennai", 45000));
        al.add(new Employee1(5, "Manoj", "Delhi", 22000));

        Function<Employee1, String> getLocation = e -> e.location;

        List<String> locations = new ArrayList<>();
        for (Employee1 e : al) {
            locations.add(getLocation.apply(e));
        }

        System.out.println("Locations: " + locations);
    }
}