import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet2 {

    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("Ravi");
        employees.add("Priya");
        employees.add("Rahul");
        employees.add("Anitha");

        Iterator<String> it = employees.iterator();

        System.out.println("Employee Names:");

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}