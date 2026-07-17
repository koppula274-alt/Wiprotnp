import java.time.LocalDate;
import java.time.Period;

public class Program3 {
    public static void main(String[] args) {
        // Replace with your actual joining date
        LocalDate joiningDate = LocalDate.of(2023, 6, 15);
        LocalDate today = LocalDate.now();

        Period experience = Period.between(joiningDate, today);

        System.out.println("Experience: " + experience.getYears() + " years, "
                + experience.getMonths() + " months, "
                + experience.getDays() + " days");
    }
}