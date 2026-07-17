import java.time.LocalTime;

public class Program6 {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime before = currentTime.minusHours(5).minusMinutes(30);

        System.out.println("Current time: " + currentTime);
        System.out.println("Time before 5 hours 30 minutes: " + before);
    }
}