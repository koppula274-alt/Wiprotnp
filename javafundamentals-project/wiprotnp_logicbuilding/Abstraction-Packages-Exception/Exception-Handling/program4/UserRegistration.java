import java.util.Scanner;

public class UserRegistration {

    static void registerUser(String username, String userCountry)
            throws InvalidCountryException {

        if(!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException(
                    "User Outside India cannot be registered");
        }

        System.out.println("User registration done successfully");
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Username:");
        String name = sc.nextLine();

        System.out.println("Enter Country:");
        String country = sc.nextLine();

        try {
            registerUser(name,country);
        }
        catch(InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}