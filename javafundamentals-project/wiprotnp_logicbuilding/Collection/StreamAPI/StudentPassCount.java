import java.util.ArrayList;

class Student {
    int rollNo;
    String name;
    int mark;

    Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }
}

public class StudentPassCount {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(1, "Arjun", 65));
        al.add(new Student(2, "Priya", 42));
        al.add(new Student(3, "Kiran", 50));
        al.add(new Student(4, "Divya", 38));
        al.add(new Student(5, "Rohit", 78));

        long passedCount = al.stream()
                .filter(s -> s.mark >= 50)
                .count();

        System.out.println("Number of students who cleared: " + passedCount);
    }
}