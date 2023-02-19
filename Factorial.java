public class Factorial {
    public static int factorial(int N) {
        int fact = 1;

        // calculating factorial
        for(int i = 1; i <= N; i++) {
            fact *= i;
        }

        // returning factorial
        return fact;
    }
}