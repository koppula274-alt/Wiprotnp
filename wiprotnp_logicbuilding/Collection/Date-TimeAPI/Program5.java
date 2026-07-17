import java.time.LocalTime;

public class Program5 {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime after25Min = currentTime.plusMinutes(25);

        System.out.println("Current time: " + currentTime);
        System.out.println("Time after 25 minutes: " + after25Min);
    }
}