package forLoop;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base number: ");
        int a = sc.nextInt();

        System.out.println("Enter the power count for operation: ");
        int b = sc.nextInt();

        int result = 1;
        for (int i = 0; i < b; i++) {
            result = result * a;
        }
        System.out.println("The given result is: " + result);
    }
}
