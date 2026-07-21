import java.time.LocalDate;

public class Program4 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int year = today.getYear();

        boolean isLeap = today.isLeapYear();

        System.out.println("Current year: " + year);
        System.out.println("Is leap year? " + isLeap);
    }
}