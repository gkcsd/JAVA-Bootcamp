package javacollectiontutorial.javaproblemstatement;

import java.util.Scanner;

public class ExceptionThrowThrows {
    public static void main(String[] args) {
        try {
            methodA();
            System.out.println("MethodA run");
        }catch (ArithmeticException err) {
            System.out.println("Arithmetic exception caught");

            err.printStackTrace();
        } finally {
            System.out.println("This code of main executed");
        }
        System.out.println("Successfully executed main block");
    }
    public static void methodA() throws ArithmeticException {
        int a = 5, c;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a valid value for variable b: ");
        int b = in.nextInt();

        if (b == 0) throw new ArithmeticException();

        c = a / b;
        System.out.println(c);
    }
}
