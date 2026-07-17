import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Program2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate nextMonth = today.plusMonths(1);

        LocalDate firstSunday = nextMonth.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
        LocalDate secondSunday = firstSunday.plusWeeks(1);

        System.out.println("Second Sunday of next month: " + secondSunday);
    }
}