package PracticePoblems;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two Numbers: ");
        double x = sc.nextInt();
        double y = sc.nextInt();

        System.out.println("Enter The Operation ( +, -, *, / ) : ");
        char operation = sc.next().charAt(0);
        double result = 0;

        switch (operation) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;
            default:
                System.out.println("Invalid literal");
        }
        System.out.println("The Addition Of " + x + " and " + y + " is " + result);
    }
}
