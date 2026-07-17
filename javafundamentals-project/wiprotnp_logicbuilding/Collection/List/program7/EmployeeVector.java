import java.util.*;

public class EmployeeVector {

    public static void main(String[] args) {

        Vector<Employee> v = new Vector<>();

        v.add(new Employee(101,"Ravi",45000));
        v.add(new Employee(102,"Priya",55000));
        v.add(new Employee(103,"Rahul",60000));

        System.out.println("Using Iterator");

        Iterator<Employee> it = v.iterator();

        while(it.hasNext())
            System.out.println(it.next());

        System.out.println("\nUsing Enumeration");

        Enumeration<Employee> e = v.elements();

        while(e.hasMoreElements())
            System.out.println(e.nextElement());

    }
}