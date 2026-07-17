import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nMAIN MENU");
            System.out.println("1. Interest Calculator - SB");
            System.out.println("2. Interest Calculator - FD");
            System.out.println("3. Interest Calculator - RD");
            System.out.println("4. Exit");

            System.out.print("Enter your option: ");
            int choice = sc.nextInt();

            try {

                switch (choice) {

                    case 1:

                        System.out.print("Enter Average Amount: ");
                        double amount = sc.nextDouble();

                        if (amount < 0)
                            throw new InvalidAmountException("Amount cannot be negative.");

                        sc.nextLine();

                        System.out.print("Enter Account Type (Normal/NRI): ");
                        String type = sc.nextLine();

                        SBAccount sb = new SBAccount(amount, type);

                        System.out.println("Interest Gained : Rs." + sb.calculateInterest());

                        break;

                    case 2:

                        System.out.print("Enter FD Amount: ");
                        amount = sc.nextDouble();

                        if (amount < 0)
                            throw new InvalidAmountException("Invalid Amount");

                        System.out.print("Enter Number of Days: ");
                        int days = sc.nextInt();

                        if (days < 0)
                            throw new InvalidAmountException(
                                    "Invalid Number of Days. Please enter non-negative values.");

                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();

                        if (age < 0)
                            throw new InvalidAmountException("Invalid Age");

                        FDAccount fd = new FDAccount(amount, days, age);

                        System.out.println("Interest Gained : Rs." + fd.calculateInterest());

                        break;

                    case 3:

                        System.out.print("Enter Monthly Amount: ");
                        double monthly = sc.nextDouble();

                        if (monthly < 0)
                            throw new InvalidAmountException("Invalid Amount");

                        System.out.print("Enter Number of Months (6,9,12,15,18,21): ");
                        int months = sc.nextInt();

                        System.out.print("Enter Age: ");
                        age = sc.nextInt();

                        RDAccount rd = new RDAccount(monthly, months, age);

                        System.out.println("Interest Gained : Rs." + rd.calculateInterest());

                        break;

                    case 4:
                        System.out.println("Thank You");
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice");
                }

            } catch (InvalidAmountException e) {

                System.out.println(e.getMessage());

            }

        }

    }
}