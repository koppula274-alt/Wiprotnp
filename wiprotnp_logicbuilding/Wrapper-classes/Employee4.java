class Employee implements Cloneable {

    int empId;
    String empName;
    double salary;

    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    // Clone method
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {

        try {
            // Original object
            Employee emp1 = new Employee(101, "Nagamani", 35000);

            // Clone object
            Employee emp2 = (Employee) emp1.clone();

            // Modify original object
            emp1.empId = 102;
            emp1.empName = "Ravi";
            emp1.salary = 45000;

            System.out.println("Original Employee Details:");
            emp1.display();

            System.out.println("\nCloned Employee Details:");
            emp2.display();

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
    }
}