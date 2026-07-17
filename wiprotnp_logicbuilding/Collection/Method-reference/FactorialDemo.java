interface FactorialFunction {
    int getFactorial(MathOps obj, int n);
}

class MathOps {
    int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

public class FactorialDemo {
    public static void main(String[] args) {
        MathOps obj = new MathOps();

        // Method reference to instance method (particular object)
        FactorialFunction ff = MathOps::factorial;

        int n = 5;
        int result = ff.getFactorial(obj, n);
        System.out.println("Factorial of " + n + " = " + result);
    }
}