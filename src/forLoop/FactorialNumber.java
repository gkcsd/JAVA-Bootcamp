package forLoop;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int fact = 1;

        for (int i = n; i >= 1; i--) {
            fact *= i;
        }
        System.out.println("The factorial of " + n + " is " + fact);
    }
}