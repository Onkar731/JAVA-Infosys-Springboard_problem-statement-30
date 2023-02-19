import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        int N = sc.nextInt();

        // printing factorial of given number using factorial() method of Factorial class
        System.out.println(Factorial.factorial(N));

        // closing resource
        sc.close();
    }
}