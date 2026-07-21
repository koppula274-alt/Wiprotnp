public class RDAccount extends Account {

    int months;
    int age;
    double monthlyAmount;

    public RDAccount(double monthlyAmount, int months, int age) {

        this.monthlyAmount = monthlyAmount;
        this.months = months;
        this.age = age;
    }

    @Override
    public double calculateInterest() {

        if (months == 6)
            interestRate = (age >= 60) ? 8.0 : 7.5;

        else if (months == 9)
            interestRate = (age >= 60) ? 8.25 : 7.75;

        else if (months == 12)
            interestRate = (age >= 60) ? 8.5 : 8.0;

        else if (months == 15)
            interestRate = (age >= 60) ? 8.75 : 8.25;

        else if (months == 18)
            interestRate = (age >= 60) ? 9.0 : 8.5;

        else if (months == 21)
            interestRate = (age >= 60) ? 9.25 : 8.75;

        return (monthlyAmount * interestRate * months) / 100;
    }
}