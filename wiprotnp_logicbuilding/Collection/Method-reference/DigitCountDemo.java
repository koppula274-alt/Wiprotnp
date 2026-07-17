interface DigitCountFunction {
    int getDigitCount(int n);
}

class NumberOps {
    static int digitCount(int n) {
        n = Math.abs(n);
        if (n == 0)
            return 1;
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}

public class DigitCountDemo {
    public static void main(String[] args) {
        // Method reference to static method
        DigitCountFunction dc = NumberOps::digitCount;

        int n = 45678;
        int result = dc.getDigitCount(n);
        System.out.println("Number of digits in " + n + " = " + result);
    }
}